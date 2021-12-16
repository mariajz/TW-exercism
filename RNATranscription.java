import java.io.*;
import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        int l = dnaStrand.length();
        char t[] = new char[l];
        for(int i=0;i<l;i++){
            char c = dnaStrand.charAt(i);
            if(c == 'G'){
                t[i] = 'C';
            }
            
            if(c == 'C'){
                t[i] =  'G';
            }
            
            if(c == 'T'){
                t[i] =  'A';
            }
            if(c == 'A'){
                t[i] =  'U';
            }
        }
        String str = String.valueOf(t);
        return str;
    }

}
