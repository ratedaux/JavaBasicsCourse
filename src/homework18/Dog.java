package homework18;

public class Dog {

    String name;
    int jumpHeight;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    void jump() {
        System.out.println("Jump!");
    }

    public int train(int jumpHeight) {
        int maxJumpHeight = jumpHeight * 2;
        if (jumpHeight < maxJumpHeight) {
            jumpHeight += 10;
            System.out.println("Jump height improved by 10!");
            if (jumpHeight >= maxJumpHeight) {
                System.out.println("Jump height is max!");
                return maxJumpHeight;
            } else return jumpHeight;
        } else return -1;
    }

    void jumpBarrier(int barrierHeight) {
        System.out.println("Trying to jump the barrier with height " + barrierHeight);
        if (jumpHeight >= barrierHeight) {
            jump();
        } else if (isTrainable(jumpHeight, jumpHeight * 2)) {
            System.out.println("Training...");
            train(jumpHeight);
            jump();
        } else {
            System.out.println("This dog won't be able to jump this barrier.");
        }
    }

    boolean isTrainable(int jumpHeight, int maxJumpHeight) {
        boolean isTrainable;
        if (jumpHeight >= maxJumpHeight) {
            isTrainable = false;
            return isTrainable;
        } else {
            isTrainable = true;
            return isTrainable;
        }
    }
}
