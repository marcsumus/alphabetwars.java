import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlphabetWarsTest {

    // Test individual fighters
    @Test
    public void woLoLoooooo_When_z_Then_RightSideWins() {
        assertEquals("Right side wins!", AlphabetWars.woLoLoooooo("z"));
    }

    @Test
    public void woLoLoooooo_When_d_Then_RightSideWins() {
        assertEquals("Right side wins!", AlphabetWars.woLoLoooooo("d"));
    }

    @Test
    public void woLoLoooooo_When_q_Then_RightSideWins() {
        assertEquals("Right side wins!", AlphabetWars.woLoLoooooo("q"));
    }

    @Test
    public void woLoLoooooo_When_m_Then_RightSideWins() {
        assertEquals("Right side wins!", AlphabetWars.woLoLoooooo("m"));
    }

    //Left
    @Test
    public void woLoLoooooo_When_s_Then_LeftSideWins() {
        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("s"));
    }

    @Test
    public void woLoLoooooo_When_b_Then_LeftSideWins() {
        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("b"));
    }

    @Test
    public void woLoLoooooo_When_p_Then_LeftSideWins() {
        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("p"));
    }

    @Test
    public void woLoLoooooo_When_w_Then_LeftSideWins() {
        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("w"));
    }

    @Test
    public void woLoLoooooo_When_t_Then_LeftSideWins() {
        assertEquals("Let's fight again!", AlphabetWars.woLoLoooooo("t"));
    }

    // 1v1 Battles
    @Test
    public void woLoLoooooo_When_bz_Then_LeftSideWins() {
        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("bz"));
    }

    @Test
    public void woLoLoooooo_When_ds_Then_RightSideWins() {
        assertEquals("Right side wins!", AlphabetWars.woLoLoooooo("ds"));
    }

    @Test
    public void woLoLoooooo_When_wm_Then_LetsFightAgain() {
        assertEquals("Let's fight again!", AlphabetWars.woLoLoooooo("wm"));
    }

    @Test
    public void woLoLoooooo_When_jm_Then_RightSideWins() {
        assertEquals("Right side wins!", AlphabetWars.woLoLoooooo("jm"));
    }

    @Test
    public void woLoLoooooo_When_jq_Then_RightSideWins() {
        assertEquals("Right side wins!", AlphabetWars.woLoLoooooo("jq"));
    }

    @Test
    public void woLoLoooooo_When_jd_Then_RightSideWins() {
        assertEquals("Right side wins!", AlphabetWars.woLoLoooooo("jd"));
    }

    @Test
    public void woLoLoooooo_When_jz_Then_RightSideWins() {
        assertEquals("Right side wins!", AlphabetWars.woLoLoooooo("jz"));
    }

    @Test
    public void woLoLoooooo_When_tw_Then_LeftSideWins() {
        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("tw"));
    }

    @Test
    public void woLoLoooooo_When_tp_Then_LeftSideWins() {
        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("tp"));
    }

    @Test
    public void woLoLoooooo_When_tb_Then_LeftSideWins() {
        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("tb"));
    }

    @Test
    public void woLoLoooooo_When_ts_Then_LeftSideWins() {
        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("ts"));
    }

    // Two fighters from the left side
    @Test
    public void woLoLoooooo_When_ssz_Then_LeftSideWins() {
        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("ssz"));
    }

    @Test
    public void woLoLoooooo_When_j_Then_LeftSideWins() {
        assertEquals("Let's fight again!", AlphabetWars.woLoLoooooo("j"));
    }

    // Neutral fighter
    @Test
    public void woLoLoooooo_When_a_Then_LeftSideWins() {
        assertEquals("Let's fight again!", AlphabetWars.woLoLoooooo("a"));
    }

    // Tests from examples
//            AlphabetWars.woLoLoooooo("tz")        //=>  "ts" => "Left side wins!"
    @Test
    public void woLoLoooooo_When_tz_Then_LeftSideWins() {
        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("tz"));
    }

    //            AlphabetWars.woLoLoooooo("zt")        //=>  "st" => "Left side wins!"
    @Test
    public void woLoLoooooo_When_zt_Then_LeftSideWins() {
        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("zt"));
    }

    //            AlphabetWars.woLoLoooooo("azt")       //=> "ast" => "Left side wins!"
    @Test
    public void woLoLoooooo_When_azt_Then_LeftSideWins() {
        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("azt"));
    }

    // Multiple Priests
    //            AlphabetWars.woLoLoooooo("tzj")       //=> "tzj" => "Right side wins!"
//    @Test
//    public void woLoLoooooo_When_tzj_Then_LeftSideWins() {
//        assertEquals("Left side wins!", AlphabetWars.woLoLoooooo("tzj"));
//    }

    @Test
    public void woLoLoooooo_When_wj_Then_RightSideWins() {
        assertEquals("Right side wins!", AlphabetWars.woLoLoooooo("wj"));
    }
}
