package Boolean;
/*
| Operador | Nome        | O que faz                            |
| -------- | ----------- | -----------------------------------  |
| &      | AND           | Liga o bit se ambos forem 1          |
| ||     | OR            | Liga o bit se pelo menos um for 1    |
| ^      | XOR           | Liga o bit se somente um for 1       |
| ~      | NOT           | Inverte os bits                      |
| <<     | Shift Left    | Desloca bits pra esquerda            |
| >>     | Shift Right   | Desloca bits pra direita             |


🧩 3️⃣ Base Octal (base 8)

👉 Usa apenas dígitos de 0 até 7.
É menos usada hoje, mas era comum em sistemas Unix antigos e permissões de arquivos.

 */
public class Binario {
    public static void main(String[] args) {
        long flag64bits = 1;
        boolean rodando = true;
        int contador = 0;

        while (rodando){
            contador++;
            flag64bits = flag64bits << 1;
            System.out.println("  Contador : " + contador + "  / Shift : \"" + flag64bits +"\"");

            if(flag64bits <= 0){
                rodando = false;
            }
        }
        System.out.println("Código Finalizado \"" + "contador : " + contador + " shifts (64 bits) : " + flag64bits + "\"");
        System.out.println("Binário : " + Long.toBinaryString(flag64bits));
        System.out.println(Long.toHexString(flag64bits) + "\"  Hexadecimal (Base 16)");

    }
}
