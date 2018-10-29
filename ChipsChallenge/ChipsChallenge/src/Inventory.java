enum Key{
    GREEN, BLUE, YELLOW, RED, CHALLENGE
}

public class Inventory {
    private int GreenKeys;
    private int BlueKeys;
    private int YellowKeys;
    private int RedKeys;
    private int ChallengeKeys;
    private boolean flippers;

    public Inventory(){
        this.BlueKeys = 0;
        this.ChallengeKeys = 0;
        this.flippers = false;
        this.GreenKeys = 0;
        this.RedKeys = 0;
        this.YellowKeys = 0;
    }

    public void addFlippers(){
        this.flippers = true;
    }

    public boolean hasFlippers(){return this.flippers;}

    public void addKey(Key key){
        switch (key){
            case RED:
                this.RedKeys += 1;
                break;
            case BLUE:
                this.BlueKeys += 1;
                break;
            case GREEN:
                this.GreenKeys += 1;
                break;
            case YELLOW:
                this.YellowKeys += 1;
                break;
            case CHALLENGE:
                this.ChallengeKeys += 1;
                break;
        }
    }

    public boolean removeKey(Key key){
        switch (key){
            case YELLOW:
                if (this.YellowKeys > 0){
                    this.YellowKeys -= 1;
                    return true;
                }else{
                    return false;
                }
            case GREEN:
                if (this.GreenKeys > 0){
                    this.GreenKeys -= 1;
                    return true;
                }else{
                    return false;
                }
            case BLUE:
                if (this.BlueKeys > 0){
                    this.BlueKeys -= 1;
                    return true;
                }else{
                    return false;
                }
            case RED:
                if (this.RedKeys > 0){
                    this.RedKeys -= 1;
                    return true;
                }else{
                    return false;
                }
        }
        return false;
    }

    public boolean removeChallenge(int keysNeeded){
        if (this.ChallengeKeys < keysNeeded){
            return false;
        }

        this.ChallengeKeys -= keysNeeded;
        return true;
    }
}
