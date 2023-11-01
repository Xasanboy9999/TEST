
        import java.util.Scanner;

        public class SwitchDataTyping {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print(" Sonni kiriting: ");
                int son = scanner.nextInt();
                String oynomi;
                String faslnomi;
                switch (son) {
                    case 1:
                        oynomi="Yanvar";
                        faslnomi="qish";
                        break;
                    case 2:
                        oynomi="Fevral";
                        faslnomi="qish";
                        break;
                    case 3:
                        oynomi="Mart";
                        faslnomi="Bahor";
                        break;
                    case 4:
                        oynomi="Aprel";
                        faslnomi="Bahor";
                        break;
                    case 5:
                        oynomi="May";
                        faslnomi="Bahor";
                        break;
                    case 6:
                        oynomi="Iyun";
                        faslnomi="Yoz";
                        break;
                    case 7:
                        oynomi="Iyul";
                        faslnomi="Yoz";
                        break;
                    case 8:
                        oynomi="Avgust";
                        faslnomi="Yoz";
                        break;
                    case 9:
                        oynomi="Sentabr";
                        faslnomi="Kuz";
                        break;
                    case 10:
                        oynomi="Oktabr";
                        faslnomi="Kuz";
                        break;
                    case 11:
                        oynomi="Noyabr";
                        faslnomi="Kuz";
                        break;
                    case 12:
                        oynomi="Dekabr";
                        faslnomi="qish";
                        break;

                    default:
                        oynomi="Notog`ri raqam kiritilgan";
                        faslnomi=" Notogri fasl kiritilgan";

                }

                System.out.println(" Kiririlgan sondagi oy nomi= "+oynomi);
                System.out.print(" Oyga mos fasl nomi ="+faslnomi);
            }}