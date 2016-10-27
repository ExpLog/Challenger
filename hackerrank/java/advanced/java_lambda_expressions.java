https://www.hackerrank.com/challenges/java-lambda-expressions?h_r=next-challenge&h_v=zen

    PerformOperation is_odd() {
        return (int a) -> a % 2 == 1;
    }

    PerformOperation is_prime() {
        //simple prime checking
        return (int a) -> {
            if(a <= 1) return false;
            if(a == 2) return true;
            for(int i = 3; i < a; i++) {
                if(a % i == 0) return false;
            }
            return true;
        };
    }

    PerformOperation is_palindrome() {
        return (int a) -> {
            String str = Integer.toString(a);
            String rev = new StringBuilder(str).reverse().toString();
            return str.equals(rev);
        };
    }
}