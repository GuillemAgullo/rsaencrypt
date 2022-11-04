import java.security.*
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec
import java.util.*
import javax.crypto.Cipher

const val ALGORITHM = "RSA"

fun main() {

    println("Hola, benvingut al meu programa ronyós:")
    val keys = generateKeys()
    val clauprivada = keys.second
    val claupublica = keys.first

        while (true) {


            println("que vols desxifrar un missatge (1) encriptar-ne un(2) is vols fer couet d'aquí --> (3) i si vols encripar el missatge d'un company--> (4)")
            val eleccio = readLine()?.toIntOrNull() ?: 0
            if (eleccio == 1) {
                println("Posa  el missatge encriptat")
                val missatgeencriptat = readLine().toString()
                val desencriptació = decrypt(missatgeencriptat, clauprivada)
                println(desencriptació)

            } else if (eleccio == 2) {
                println("Així que vols enviar un missatge eh? petit trapella... escriu-lo va:")
                val missatge = readLine().toString()
                val nosequeposar = encrypt(missatge, claupublica)
                println(nosequeposar)
            } else if (eleccio == 3) {
                break
            }else if (eleccio == 4){
                println("inserta clau pública del company:")
                val clavepubli = readLine().toString()
                println("inserta el missatge que vols encriptar")
                val missatget = readLine().toString()
                val quetalnosequeposar = encrypt(missatget, clavepubli)
                print(quetalnosequeposar)

            }else if (eleccio != 1 || eleccio != 2 || eleccio != 3 || eleccio != 4){
                continue
            }

        }
}

fun generateKeys(): Pair<String, String> {
    val keyGen = KeyPairGenerator.getInstance(ALGORITHM).apply {
        initialize(512)
    }

    // Key generation
    val keys = keyGen.genKeyPair()

    // Transformation to String (well encoded)
    val publicKeyString = Base64.getEncoder().encodeToString(keys.public.encoded)
    val privateKeyString = Base64.getEncoder().encodeToString(keys.private.encoded)

    return Pair(publicKeyString, privateKeyString)
}

fun encrypt(message: String, publicKey: String): String {
    // From a String, we obtain the Public Key
    val publicBytes = Base64.getDecoder().decode(publicKey)
    val decodedKey = KeyFactory.getInstance(ALGORITHM).generatePublic(X509EncodedKeySpec(publicBytes))

    // With the public, we encrypt the message
    val cipher = Cipher.getInstance(ALGORITHM).apply {
        init(Cipher.ENCRYPT_MODE, decodedKey)
    }
    val bytes = cipher.doFinal(message.encodeToByteArray())
    return String(Base64.getEncoder().encode(bytes))
}

fun decrypt(encryptedMessage: String, privateKey: String): String {
    // From a String, we obtain the Private Key
    val publicBytes = Base64.getDecoder().decode(privateKey)
    val decodedKey = KeyFactory.getInstance(ALGORITHM).generatePrivate(PKCS8EncodedKeySpec(publicBytes))

    // Knowing the Private Key, we can decrypt the message
    val cipher = Cipher.getInstance(ALGORITHM).apply {
        init(Cipher.DECRYPT_MODE, decodedKey)
    }
    val bytes = cipher.doFinal(Base64.getDecoder().decode(encryptedMessage))
    return String(bytes)
}


