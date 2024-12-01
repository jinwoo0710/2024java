package report1111;
import java.util.*;
class Word {
    private String word;   
    private String meaning; 
    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }
    public String getWord() {
        return word;
    }
    public String getMeaning() {
        return meaning;
    }
    public String toString() {
        return word + " - " + meaning;
    }
}
public class OpenChallenge {
    private Vector<Word> words;  
    public OpenChallenge() {
        words = new Vector<Word>();
        // 단어 추가
        words.add(new Word("love", "사랑"));
        words.add(new Word("animal", "동물"));
        words.add(new Word("friend", "친구"));
        words.add(new Word("computer", "컴퓨터"));
        words.add(new Word("book", "책"));
        words.add(new Word("music", "음악"));
        words.add(new Word("city", "도시"));
        words.add(new Word("flower", "꽃"));
        words.add(new Word("sun", "태양"));
        words.add(new Word("moon", "달"));
        words.add(new Word("water", "물"));
        words.add(new Word("fire", "불"));
        words.add(new Word("earth", "지구"));
        words.add(new Word("wind", "바람"));
        words.add(new Word("sky", "하늘"));
        words.add(new Word("tree", "나무"));
        words.add(new Word("mountain", "산"));
    }
    
    public void runQuiz() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 17개의 단어가 들어 있습니다.");
        while(true) {

	        Word correctAnswer = words.get(random.nextInt(words.size()));
	       
	        Set<Word> choices = new HashSet<>();
	        choices.add(correctAnswer);
	        
	        while (choices.size() < 4) {
	            Word incorrectWord = words.get(random.nextInt(words.size()));
	            if (!incorrectWord.equals(correctAnswer)) {
	                choices.add(incorrectWord);
	            }
	        }
	        
	        List<Word> choiceList = new ArrayList<>(choices);
	        Collections.shuffle(choiceList);
	        System.out.println(correctAnswer.getWord() + "?");
	        for (int i = 0; i < choiceList.size(); i++) {
	            System.out.print("("+(i + 1) + ")" + choiceList.get(i).getMeaning()+" ");
	        }
	        System.out.print(":>");
	        
	        int userAnswer = scanner.nextInt();
	        
	        if(userAnswer == -1) {
	        	System.out.println("\"명품영어\"를 종료합니다...");
	        	break;
	        }
	        if (choiceList.get(userAnswer - 1).getMeaning().equals(correctAnswer.getMeaning())) {
	            System.out.println("Excellent !!");
	        } else {
	            System.out.println("no. !!");
	        }
        }
        scanner.close();
    }
    public static void main(String[] args) {
    	OpenChallenge quiz = new OpenChallenge();
        quiz.runQuiz();
    }
}