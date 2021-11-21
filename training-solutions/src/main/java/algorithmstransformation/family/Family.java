package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> familyList = new ArrayList<>();

    public Family(List<FamilyMember> familyList) {
        this.familyList = familyList;
    }

    public List<FamilyMember> getFamilyList() {
        return familyList;
    }

    public void addFamilyList(FamilyMember family) {
        this.familyList.add(family);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String name) {
        List<Integer> returnList = new ArrayList<>();
        for (FamilyMember familymember : familyList) {
            if (familymember.getName().contains(name)) {
                returnList.add(familymember.getAge());
            }
        }
        return returnList;
    }
}
