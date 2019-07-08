package by.javatr.task10;

public class Check {
    public static int first(char a) {
        int result = 0;
        if (a == 'а' || a == 'е' || a == 'ё' || a == 'и' || a == 'о' || a == 'у' || a == 'ы' || a == 'э' || a == 'ю'
                || a == 'я' || a == 'a' || a == 'e' || a == 'y' || a == 'u' || a == 'i' || a == 'o' || a == 'A'||
                a == 'E' || a == 'Y' || a == 'U' || a == 'I' || a == 'O' || a == 'А' || a == 'Е' || a == 'Ё' || a == 'И'
                || a == 'Ы' || a == 'У' || a == 'О' || a == 'Э' || a == 'Ю' || a == 'Я') {
            result++;
        }
        return result;
    }
    public static int second(char a) {
        int result = 0;
        switch (a) {
            case 'а':
            case 'е':
            case 'ё':
            case 'и':
            case 'о':
            case 'ы':
            case 'у':
            case 'э':
            case 'ю':
            case 'я':
            case 'a':
            case 'e':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
            case 'A':
            case 'E':
            case 'Y':
            case 'U':
            case 'I':
            case 'O':
            case 'А':
            case 'Ё':
            case 'У':
            case 'Е':
            case 'Э':
            case 'О':
            case 'Ы':
            case 'Я':
            case 'И':
            case 'Ю':
                result++;
                break;
            default:
                break;
        }
        return result;
    }
    public static int third(char a) {
        int result = 0;
        if(a == '\u0041' || a == '\u0045' || a == '\u0049' || a == '\u004F' || a == '\u0055' || a == '\u0059' ||
                a == '\u0061' || a == '\u0065' || a == '\u0069' || a == '\u006F' || a == '\u0075' || a == '\u0079'
                || a == '\u0410' || a == '\u0415' || a == '\u0418' || a == '\u041E' || a == '\u0423' ||
                a == '\u042B' || a == '\u042D' || a == '\u042E' || a == '\u042F'|| a == '\u0430' || a == '\u0435' ||
                a == '\u0438' || a == '\u043E' || a == '\u0443' || a == '\u044B' || a == '\u044D' || a == '\u044E' ||
                a == '\u044F'){
            result++;
        }
        return result;
    }
    public static int fourth(char a) {
        int result = 0;
        char[] b = new char[]{'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я', 'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы',
                'Э', 'Ю', 'Я', 'A', 'E', 'Y', 'U', 'I', 'O', 'a', 'e', 'y', 'u', 'i', 'o'};
        for(int i = 0; i < b.length; i++){
            if(b[i] == a){
                return ++result;
            }
        }
        return result;
    }
}
