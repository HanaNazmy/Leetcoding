//https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanHelp(String s, int num)
    {
          if (s.isEmpty())
        {
             return num;
        }
          if (s.startsWith("M"))
        {
            num += 1000;
            return romanHelp(s.substring(1),num);
        }
         else if (s.startsWith("D"))
        {
            num += 500;
            return romanHelp(s.substring(1),num);
        }
         else if (s.startsWith("CM"))
        {
            num += 900;
            return romanHelp(s.substring(2),num);
        }
         else if (s.startsWith("CD"))
        {
            num += 400;
            return romanHelp(s.substring(2),num);
        }
         else if (s.startsWith("C"))
        {
            num += 100;
            return romanHelp(s.substring(1),num);
        }
        else if (s.startsWith("L"))
        {
            num += 50;
            return romanHelp(s.substring(1),num);
        }
         else if (s.startsWith("XL"))
        {
            num += 40;
            return romanHelp(s.substring(2),num);
        }
         else if (s.startsWith("XC"))
        {
            num += 90;
            return romanHelp(s.substring(2),num);
        }
        else if (s.startsWith("X"))
        {
            num += 10;
            return romanHelp(s.substring(1),num);
        }
        else if (s.startsWith("V"))
        {
            num += 5;
            return romanHelp(s.substring(1),num);
        }
         else if (s.startsWith("IX"))
        {
            num += 9;
            return romanHelp(s.substring(2),num);
        }
         else if (s.startsWith("IV"))
        {
            num += 4;
            return romanHelp(s.substring(2),num);
        }
        else if (s.startsWith("I"))
        {
            num += 1;
            return romanHelp(s.substring(1),num);
        }
        
        return num;
        
    }
    public int romanToInt(String s) {
        int num = 0;
        return romanHelp(s,num);   
    }
}
