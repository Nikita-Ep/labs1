import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main res = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println(res.sumLastNums(12));
        System.out.println(res.isPositive(-3));
        System.out.println(res.pow(2, 3));
        System.out.println(res.equalNum(99));
        System.out.println(res.leftTriangle(4));
     //   String gameResult = res.guessGame(10);
       // System.out.println(gameResult);
        int[] myArr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(res.reverse(myArr)));
    }

    private static int readInt(Scanner scanner) {
       while (true) {
           System.out.print("Введите целое число: ");
           if (scanner.hasNextInt()) {
               return scanner.nextInt();
           }
           System.out.println("Введи другое значение");
           scanner.next();
       }
    }

        public int sumLastNums(int x) {
            int a = x % 10;
            int b = (x / 10) % 10;
            return a + b;
        }

    public boolean isPositive(int x) {
        return x > 0;
    }

    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public boolean isDivisor(int a, int b) {
        int c1 = b % a;
        int c2 = a % b;
        return c1 == 0 || c2 == 0;
    }

    public int lastNumSum(int a, int b) {
        return a % 10 + b % 10;
    }

    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    public String makeDecision(int x, int y) {
        if (x > y) {
            return x + ">" + y;
        } else if (x < y) {
            return x + "<" + y;
        } else {
            return x + "==" + y;
        }
    }

    public boolean sum3(int x, int y, int z) {
        if (((x + y) == z) || ((x + z) == y) || ((z + y) == x)) {
            return true;
        } else {
            return false;
        }
    }

    public String age(int x) {
        int lastTwo = x % 100;
        int last = x % 10;

        if (lastTwo >= 11 && lastTwo <= 14) {
            return x + " лет";
        }

        if (last == 1) {
            return x + " год";
        }

        if (last >= 2 && last <= 4) {
            return x + " года";
        }

        return x + " лет";
    }

    public void printDays(String x) {
        if (x == null) {
            System.out.println("это не день недели");
            return;
        }
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
                break;
        }
    }

    public String reverseListNums(int x) {
        String res = "";
        while (x >= 0) {
            res = res + x + " ";
            x--;
        }
        return res;
    }

    public int pow(int x, int y) {
        int res = 1;
        while (y > 0) {
            res = res * x;
            y--;
        }
        return res;
    }

    public boolean equalNum(int x) {
        int last = x % 10;
        while (x > 9) {
            x = x / 10;
            int cur = x % 10;
            if (last != cur) {
                return false;
            }
        }
        return true;
    }

    public String leftTriangle(int x) {
        String res = "";
        String line = "";

        for (int i = 1; i <= x; i++) {
            line = line + "*";
            res = res + line + "\n";
        }

        return res;
    }

    public String guessGame(int x) {
        Random random = new Random();
        int randomnum = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int userGuess;

        do {
            userGuess = readInt(scanner);
            if (userGuess < 0 || userGuess > 9) {
                System.out.println("Число вне диапазона!");
                continue;
            }
            attempts++;
            if (userGuess == randomnum) {
                System.out.println("Угадал!");
            } else {
                System.out.println("не угадал");
            }
        } while (userGuess != randomnum);

        return "Количество попыток: " + attempts;
    }

    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (i < pos) {
                newArr[i] = arr[i];
            } else if (i == pos) {
                newArr[i] = x;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }

    public int[] reverse(int[] arr) {
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }
        return newArr;
    }

    public int[] deleteNegative(int[] arr) {
        int c = 0;
        for (int x : arr) {
            if (x >= 0) {
                c++;
            }
        }
        int[] newArr = new int[c];
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                newArr[ind++] = arr[i];
            }
        }
        return newArr;
    }

}