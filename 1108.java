class Solution {
    public String defangIPaddr(String address) {
        // // version: 1
        // return address.replaceAll("\\.","[.]");

        // //versin: 2
        // return address.replace(".","[.]");

        //version: 3
        StringBuffer res=new StringBuffer();
        for(char c:address.toCharArray()){
            if(c=='.')
              res.append("[.]");
              else
               res.append(c);
        }
        return res.toString();
    }
}