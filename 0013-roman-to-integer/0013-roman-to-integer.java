class Solution {
    public static int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = getNumber(c);

            if (i + 1 == s.length()) {
                sum += num;
                continue;
            }

            char next_char = s.charAt(i + 1);

            // 바로 뒤에 나오는 숫자보다 작으면 숫자를 빼야 한다
            if (num < getNumber(next_char)) {
                sum -= num;
            } else {
                sum += num;
            }

        }
        return sum;
    }

    public static int getNumber (char Symbol) {
        switch(Symbol) {
            case 'V': { return 5; }
            case 'X': { return 10; }
            case 'L': { return 50; }
            case 'C': { return 100; }
            case 'D': { return 500; }
            case 'M': { return 1000; }
            default: { return 1; }
        }
    }
}