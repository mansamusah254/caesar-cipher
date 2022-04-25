import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptTest {
    @Test
    public void runDecrypt_instantiates(){
        Decrypt testDecrypt = new Decrypt("!obnf", 1);
        assertEquals(true, testDecrypt instanceof Decrypt);
    }

    @Test
    public void runDecrypt_ifInputIsString() {
        Decrypt testDecrypt = new Decrypt("obnf", 1);
        assertEquals("obnf", testDecrypt.getmInputString());
    }

    @Test
    public void runDecrypt_ifKeyIsInt() {
        Decrypt testDecrypt = new Decrypt("obnf",1);
        assertEquals(1, testDecrypt.getmShift());
    }
    @Test
    public void runDecrypt_ifDecryptsVariousInputs() {
        Decrypt testDecrypt = new Decrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 3);
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", Decrypt.decrypt(testDecrypt));
    }
}