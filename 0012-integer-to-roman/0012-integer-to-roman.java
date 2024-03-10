class Solution {
    public String intToRoman(int num) {
String [] enums = new String []  {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};                     
        int [] values = new int [] {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int pos = enums.length-1;
        StringBuilder builder = new StringBuilder();
        while (num > 0){
            while (num >= values[pos]){
                builder.append(enums[pos]);
                num -= values[pos];
            }
            pos--;
        }
        return builder.toString();
    }
    }
