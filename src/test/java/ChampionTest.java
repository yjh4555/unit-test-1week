import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ChampionTest {

    private List<Champion> championList = new ArrayList<Champion>();

    @Before
    public void setUp(){

        //5개의 챔피언 객체를 만듭니다.
        Champion topChamp = new Champion("다리우스","탑");
        Champion jungleChamp = new Champion("리신","정글");
        Champion midChamp = new Champion("르블랑","미드");
        Champion adcChamp = new Champion("베인", "바텀");
        Champion supportChamp = new Champion("레오나", "바텀");

        //앞서 만든 List 에 각 챔피언을 추가합니다.
        championList.add(topChamp);
        championList.add(jungleChamp);
        championList.add(midChamp);
        championList.add(adcChamp);
        championList.add(supportChamp);
    }

    @Test
    public void givenCollectionWhenEmptyCorrect() {
        List<String> emptyList = new ArrayList<String>();
        assertThat(emptyList, empty());
    }

    @Test
    public void notNullCheck() {
        String lck = "LCK";
        assertThat(lck, notNullValue());
    }

    @Test
    public void testCheckStringStream() {
        String sampleString = "Player Focus";
        String startString = "Player";
        String endString = "Focus";

        assertThat(sampleString, anyOf(startsWith(startString), containsString(endString)));
        assertThat(sampleString, is(endsWith(endString)));
    }

    @Test
    public void testCheckFloatingPoint() {
        assertThat(3.14, closeTo(3, 0.2));
    }

    // 의미없어 보이는 테스트일 수 있으나 에러가 발생하게 되면 테스트 Fail
    //2가 아닌 5이상의 값을 참조할 경우에는 에러가 발생
    @Test
    public void shouldNotErrorGetReference() {
        assertThat(championList.get(2), anything());
    }

    @Test
    public void shouldChampionCountFive() {
        assertThat(championList.size(), is(5));
        assertThat(championList, hasSize(5));
    }

    @Test
    public void supportChampMustBeTarik() {
        Champion supportChamp = new Champion("타릭", "바텀");
        assertThat("타릭", is(supportChamp.getName()));
        assertThat("타릭", is(equalTo(supportChamp.getName())));
        assertThat("타릭", equalTo(supportChamp.getName()));
    }

    @Test
    public void shouldHasPropertyPosition() {
        assertThat(championList.get(0), hasProperty("position"));
        assertThat(championList.get(0), hasProperty("position", equalTo("탑")));
    }

    @Test
    public void shouldHaveSomeChampName() {
        List<String> championNames = Arrays.asList("루시안", "애쉬", "렉사이", "갈리오", "모르가나", "블라디미르");
        assertThat(championNames.get(1), hasToString("애쉬"));
    }

    @Test
    public void shouldTopChampionIsDarius() {
        Optional<Champion> filterChampion = championList.stream()
                .filter(c -> c.getPosition().equals("탑"))
                .findFirst();
        String champName = filterChampion.get().getName();
        assertTrue(champName.equals("다리우스"));
        assertThat("다리우스", is(champName));
    }

}