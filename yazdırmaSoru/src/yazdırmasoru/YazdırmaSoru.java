//FATİH ÖZKAYNAK AVP SORU1
package yazdırmasoru;

import java.util.Scanner;

public class YazdırmaSoru {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String name = k.nextLine();
        String lastname = k.nextLine();

        int nameLength = name.length();
        int lastnameLength = lastname.length();

        while (nameLength % 12 != 0) {
            name = name + "*";
            nameLength = name.length();
        }

        int piece = nameLength / 4;
        String nameSpace = "";
        for (int i = 0; i < piece - 2; i++) {
            nameSpace = nameSpace + " ";
        }

        String piece1 = name.substring(0, piece);
        String piece2 = name.substring(piece, 2 * piece);
        String piece3 = name.substring(2 * piece, 3 * piece);
        String piece4 = name.substring(3 * piece, 4 * piece);

        System.out.println(piece1);
        int i = 0;
        while (i < piece) {
            int j = piece - 1 - i;
            System.out.println(piece2.substring(i, i + 1) + nameSpace + piece4.substring(j, j + 1));
            i++;
        }

        System.out.println(piece3);

        while (lastnameLength % 12 != 0) {
            lastname = lastname + "+";
            lastnameLength = lastname.length();
        }

        int lastnamePiece = lastnameLength / 3;
        String lastnameSpace = "";
        for (int p = 0; p < lastnamePiece - 2; p++) {
            lastnameSpace = lastnameSpace + " ";
        }

        String lastnamePiece1 = lastname.substring(0, lastnamePiece);
        String lastnamePiece2 = lastname.substring(lastnamePiece, 2*lastnamePiece);
        String lastnamePiece3 = lastname.substring(2*lastnamePiece, 3*lastnamePiece);
        
        int z=0;
        while (z<lastnamePiece) {
            int x=lastnamePiece-1-z;
            System.out.println(lastnamePiece1.substring(z,z+1)+lastnameSpace+lastnamePiece3.substring(x,x+1));
            z++;
        }
        
        System.out.println(lastnamePiece2);

    }

}
