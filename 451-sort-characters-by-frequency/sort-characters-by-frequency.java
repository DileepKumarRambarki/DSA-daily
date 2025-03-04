class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[62];
        int max=0;
        String res="";
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i);
            if(ind>=48&& ind<=57){
                freq[ind-48]++;
                max=Math.max(max,freq[ind-48]);
            }
            else if(ind>=65&&ind<=90){
                freq[ind-65+10]++;
                max=Math.max(max,freq[ind-65+10]);

            }
            else if(ind>=97&&ind<=122){
                freq[ind-97+36]++;
                max=Math.max(max,freq[ind-97+36]);

            }
        }
        for(int i=max;i>0;i--){
            for(int j=0;j<62;j++){
                if(freq[j]==i){
                    char ch=' ';
                    if(j>=0&&j<=9){
                        ch=(char)(j+48);
                    }
                    else if(j>=10&&j<=35){
                        ch=(char)(j-10+65);
                    }
                    else if(j>=36&&j<=61){
                        ch=(char)(j-36+97);
                    }
                    for(int k=0;k<i;k++){
                        res=res+ch;
                    }
                }
            }
        }
        return res;
    }
}