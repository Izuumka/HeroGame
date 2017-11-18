import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.*;


public class TestCharacters {
    private ArrayList<Character> characters = new ArrayList<Character>();
    private GameManager gameManager;

    @Before
    public void init() {
        characters.add(new Hobbit());
        characters.add(new King());
        characters.add(new Elf());
        characters.add(new Knight());
    }
    @After
    public void finish() {
        gameManager = null;
        characters = null;
    }
    @Test
    public void test_ch(){
        for (int i = 0; i <characters.size() ; i++) {
            characters.get(i).hp = characters.get(i).hp - 1000;
            assertEquals(false,characters.get(i).isAlive());
        }
        characters.get(3).setHp(1000);
        assertEquals(true,characters.get(3).isAlive());

    }
    @Test
    public void test_g(){
        gameManager = new GameManager(characters.get(0), characters.get(1));
        gameManager.game_play();
        assertEquals(false, characters.get(0).isAlive());
        assertEquals(true, characters.get(1).isAlive());

    }
}
