package GenericType7_7;

import java.util.Comparator;

public class TeacherByNameComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.name.compareTo(o2.name);
    }
}
