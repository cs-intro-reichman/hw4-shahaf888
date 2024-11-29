public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        String[] sentences1 = {
            "Our product will transform the market",
            "This blockchain-based solution will disrupt the industry",
            "Use simple words without hype and leverage fluff Paradigm"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences1, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String helper = "";
        String lower = "";
        boolean checker = false;
        for (int i = 0; i < sentences.length; i++){
            lower = sentences[i].toLowerCase();
            checker = false;
            helper = "";
            int j = 0;
            while (j < lower.length() && !checker){
                if (lower.charAt(j) != ' ')
                {
                    helper = helper + lower.charAt(j);
                }
                else{
                    for (int m = 0; m < keywords.length; m++){
                        if (helper.equals(keywords[m].toLowerCase())){
                            System.out.println(sentences[i]);
                            checker = true;
                            break;
                        }
                    }
                    helper = "";
                }
                j++;
            }
            if(!checker){
                for (int m = 0; m < keywords.length; m++){
                    if(helper.equals(keywords[m].toLowerCase())){
                        System.out.println(sentences[i]);
                    }
                }

            }



        }
    }



 
}
