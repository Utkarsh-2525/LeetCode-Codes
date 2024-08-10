import java.util.ArrayList;
import java.util.List;

void main() {
    String[] words = {"leet","code"};
    List<Integer> list= new ArrayList<>(findWordsContaining(words, 'e'));
    System.out.println(list);
}

public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < words.length; i++)
        if (words[i].contains("" + x))
            list.add(i);
    return list;
}