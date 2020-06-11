import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlphabetWarsTest {
    //Right
    @Test
    public void woLoLoooooo_When_z_Then_RightSideWins() {
        assertEquals("Right side wins!",   AlphabetWars.woLoLoooooo("z"));
    }

    @Test
    public void woLoLoooooo_When_d_Then_RightSideWins() {
        assertEquals("Right side wins!",   AlphabetWars.woLoLoooooo("d"));
    }

    @Test
    public void woLoLoooooo_When_q_Then_RightSideWins() {
        assertEquals("Right side wins!",   AlphabetWars.woLoLoooooo("q"));
    }

    @Test
    public void woLoLoooooo_When_m_Then_RightSideWins() {
        assertEquals("Right side wins!",   AlphabetWars.woLoLoooooo("m"));
    }

    //Left
    @Test
    public void woLoLoooooo_When_s_Then_LeftSideWins() {
        assertEquals("Left side wins!",   AlphabetWars.woLoLoooooo("s"));
    }

    @Test
    public void woLoLoooooo_When_b_Then_LeftSideWins() {
        assertEquals("Left side wins!",   AlphabetWars.woLoLoooooo("b"));
    }

    @Test
    public void woLoLoooooo_When_p_Then_LeftSideWins() {
        assertEquals("Left side wins!",   AlphabetWars.woLoLoooooo("p"));
    }

    @Test
    public void woLoLoooooo_When_w_Then_LeftSideWins() {
        assertEquals("Left side wins!",   AlphabetWars.woLoLoooooo("w"));
    }

    //Battles
    @Test
    public void woLoLoooooo_When_bz_Then_LeftSideWins() {
        assertEquals("Left side wins!",   AlphabetWars.woLoLoooooo("bz"));
    }

    @Test
    public void woLoLoooooo_When_ds_Then_RightSideWins() {
        assertEquals("Right side wins!",   AlphabetWars.woLoLoooooo("ds"));
    }

    @Test
    public void woLoLoooooo_When_wm_Then_LetsFightAgain() {
        assertEquals("Let's fight again!",   AlphabetWars.woLoLoooooo("wm"));
    }



}
