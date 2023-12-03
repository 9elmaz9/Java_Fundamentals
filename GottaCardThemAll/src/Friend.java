import java.util.Objects;

public class Friend {
    String  name;
    boolean family;
    int yearsKnown;
    int friendShipLevel;


    public Friend(String name, boolean family, int yearsKnown, int friendShipLevel) {
        this.name = name;
        this.family = family;
        this.yearsKnown = yearsKnown;
        this.friendShipLevel = friendShipLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return family == friend.family && yearsKnown == friend.yearsKnown && friendShipLevel == friend.friendShipLevel && Objects.equals(name, friend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family, yearsKnown, friendShipLevel);
    }

    @Override
    public String toString() {
        return "Friend" +
                "name='" + name + '\'' +
                ", family=" + family +
                ", yearsKnown=" + yearsKnown +
                ", friendShipLevel=" + friendShipLevel ;
    }
}

