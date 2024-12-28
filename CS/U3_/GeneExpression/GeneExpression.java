public class GeneExpression{
   public static String unzipDNA(String cDNA){
      /*Given a coding DNA strand (in 5'-3' order)
      generate the corresponding template strand
     
      Return the template strand in 5'-3' order
          
      Input:
         String cDNA: the coding DNA sequence in 5'-3' order
      Output:
         return: the template DNA sequence in 5'-3' order
     
      Ex.
            (coding)
      5'  ATGATCTCGTAA  3'
      3'  TACTAGAGCATT  5'
           (template)
     
      unzipDNA("ATGATCTCGTAA") -> "TTACGAGATCAT"
      */

		String NewDNA = cDNA.replaceAll("A", "t");
		String NewDNA1 = NewDNA.replace("T", "a");
      String NewDNA2 = NewDNA1.replace("G", "c");
      String NewDNA3 = NewDNA2.replace("C", "g");
      String NewDNA4 = NewDNA3.replace("a", "A");
      String NewDNA5 = NewDNA4.replace("t", "T");
      String NewDNA6 = NewDNA5.replace("g", "G");
      String NewDNA7 = NewDNA6.replace("c", "C");
      
      
      if (NewDNA7 == null) {
        return NewDNA7;
    }

    String NewDNA8 = "";

    for (int i = NewDNA7.length() -1; i >= 0; i--) {
        NewDNA8 = NewDNA8 + NewDNA7.charAt(i);
    }

    return NewDNA8;
}
      
   public static String transcribeRNA(String tDNA){
      /*Transcribe DNA to RNA. Given a template strand
      of DNA, returns the resulting RNA sequence in 5'-3' order
     
      Input:
         tDNA: template DNA strand in 5'-3' order
      Output:
         return: RNA strand in 5'-3' order
     
      Ex.
           (DNA)
      5'  GATCAT   3'
      3'  CUAGUA   5'     
           (RNA)
     
      transcribeRNA("GATCAT") -> "AUGAUC"
      */
   
      String NewDNA9 = tDNA.replace("A", "u");
		String NewDNA10 = NewDNA9.replace("T", "a");
      String NewDNA11 = NewDNA10.replace("G", "c");
      String NewDNA12 = NewDNA11.replace("C", "g");
      String NewDNA13 = NewDNA12.replace("a", "A");
      String NewDNA14 = NewDNA13.replace("u", "U");
      String NewDNA15 = NewDNA14.replace("g", "G");
      String NewDNA16 = NewDNA15.replace("c", "C");

         if (NewDNA16 == null) {
           return NewDNA16;
       }
   
       String NewDNA17 = "";
   
       for (int i = NewDNA16.length() -1; i >= 0; i--) {
           NewDNA17 = NewDNA17 + NewDNA16.charAt(i);
       }
   
       return NewDNA17;
}
   public static String translateAmino(String mRNA){
      /*Translate mRNA to an amino acid sequence.
      If you see a STOP codon, stop translating,
      otherwise, translate the whole sequence
     
      Input:
         String mRNA: an mRNA sequence in 5'-3' order
      Output:
         return: corresponding amino acid sequence
        
      Ex.
      translateAmino("AUGAUCUCGUAA") -> "MIS"
      */
      int i = 0;
    String result = "";
    while (i <= mRNA.length() - 3) {
    String triplet = mRNA.substring(i,i+=3);
        if (triplet.equals("UUU") || triplet.equals("UUC"))
            result += 'F';
        if (triplet.equals("UUA") || triplet.equals("UUG")
                || triplet.equals("CUU") || triplet.equals("CUC")
                || triplet.equals("CUA") || triplet.equals("CUA")
                || triplet.equals("CUG"))
            result += 'L';
        if (triplet.equals("AUU") || triplet.equals("AUC")
                || triplet.equals("AUA"))
            result += 'I';
        if (triplet.equals("AUG"))
            result += 'M';
        if (triplet.equals("GUU") || triplet.equals("GUC")
                || triplet.equals("GUA") || triplet.equals("GUG"))
            result += 'V';
        if (triplet.equals("UCU") || triplet.equals("UCC")
                || triplet.equals("UCA") || triplet.equals("UCG"))
            result += 'S';
        if (triplet.equals("AGA") || triplet.equals("AGG"))
            result += 'R';
        if (triplet.equals("AGU") || triplet.equals("AGC"))
            result += 'S';
        if (triplet.equals("UGG"))
            result += 'W';
        if (triplet.equals("UGU") || triplet.equals("UGC"))
            result += 'C';
        if (triplet.equals("GAA") || triplet.equals("GAG"))
            result += 'E';
        if (triplet.equals("GAU") || triplet.equals("GAC"))
            result += 'D';
        if (triplet.equals("AAA") || triplet.equals("AAG"))
            result += 'K';
        if (triplet.equals("AAU") || triplet.equals("AAC"))
            result += 'N';
        if (triplet.equals("CAA") || triplet.equals("CAG"))
            result += 'Q';
        if (triplet.equals("CAU") || triplet.equals("CAC"))
            result += 'H';
        if (triplet.equals("UAU") || triplet.equals("UAC"))
            result += 'Y';
        if (triplet.equals("CCG") || triplet.equals("CCA")
                || triplet.equals("CCC") || triplet.equals("CCU"))
            result += 'P';
        if (triplet.equals("ACG") || triplet.equals("ACA")
                || triplet.equals("ACC") || triplet.equals("ACU"))
            result += 'T';
        if (triplet.equals("GCG") || triplet.equals("GCA")
                || triplet.equals("GCC") || triplet.equals("GCU"))
            result += 'A';
        if (triplet.equals("CGG") || triplet.equals("CGA")
                || triplet.equals("CGC") || triplet.equals("CGU"))
            result += 'R';
        if (triplet.equals("GGG") || triplet.equals("GGA")
                || triplet.equals("GGC") || triplet.equals("GGU"))
            result += 'G';
        if (triplet.equals("UAG") || triplet.equals("UAA")
                || triplet.equals("UGA"))
            result += ' ';
    }
    return result;
} 
      
   public static void main(String[] args){
      /*
      1) Read a DNA coding strand from StdIn
      2) Unzip the DNA to get the template strand
      3) Transcribe mRNA from the template strand
      4) Translate the mRNA to amino acids
      5) Print the amino acid sequence to StdOut
      */
      StdOut.println(translateAmino(transcribeRNA(unzipDNA(StdIn.readString()))));
   }    
}  


      
      