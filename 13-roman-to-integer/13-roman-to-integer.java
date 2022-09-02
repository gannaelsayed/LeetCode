class Solution {
    public int romanToInt(String s) {
    	int res = 0;
    	
    	for (int i = 0; i <s.length();i++) {
    		if (i!=(s.length()-1) && (getValue(s.charAt(i+1)) > getValue(s.charAt(i))) ) {
    			res -= getValue(s.charAt(i));
    		}
    		else {
    			res += getValue(s.charAt(i));
    		}
    	}
    	return res;
        
    }
    
    public static int getValue (char c) {
    	int val = -1;
    	switch(c) {
    	case 'I': val = 1; break;
    	case 'V': val = 5; break;
    	case 'X': val = 10; break;
    	case 'L': val = 50; break;
    	case 'C': val = 100; break;
    	case 'D': val = 500; break;
    	case 'M': val = 1000; break;
    	}
    	return val;
    }
    
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	System.out.println(sol.romanToInt("MCMXCIV"));	
	}
    
}