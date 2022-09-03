class Solution {
	
    public boolean canConstruct(String ransomNote, String magazine) {
    	boolean res = true;
    	StringBuilder mag = new StringBuilder(magazine); //so I can replace the consumed char with a 0 later
    	for (int i = 0; i<ransomNote.length(); i++) {
    		boolean found = false;
        	int pos = -1;
    		for (int j = 0; j<mag.length();j++) {
    			if (mag.charAt(j)==ransomNote.charAt(i)) {
        			found = true;
        			pos = j;
        			break;
        		}
    			
    		}
    		if (found) {
    			mag.setCharAt(pos,'0');
    		}
    		else {
    			res = false;
    			break;
    			
    		}
    		
    	}
    	return res;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.canConstruct("abb", "ba"));
	}

}