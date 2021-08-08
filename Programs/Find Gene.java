class FindGene
{
    public String FindGeneSimple(String dna)
    {
        //start codon is ATG
        //Stop codon is TAA
        String result="";
        int startIndex= dna.indexOf("ATG");
        // returns the index of is substring after 3rd index
        int stopIndex= dna.indexOf("TAA",startIndex+3);
        result= dna.substring(startIndex,stopIndex+3);
        return result;
    }
    public void testFindGeneSample()
    {
        String dna ="AATGCGTAATAGGT";
        System.out.println("DNA Strand: "+dna);
        String gene= FindGeneSimple(dna);
        System.out.println("Gene is "+gene);

        dna = "AATGCGTAGGTAATATGGT";
        System.out.println("\nDNA Strand: " + dna);
        gene = FindGeneSimple(dna);
        System.out.println("Gene is " + gene);
    } 
       
    public static void main(String[] args) 
    {
        FindGene f = new FindGene();
        f.testFindGeneSample();
    }
}