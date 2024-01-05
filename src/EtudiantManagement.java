import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class EtudiantManagement implements Management{

    @Override
    public void displayStudents(List<Etudiant> students, Consumer<Etudiant> con){
        for (Etudiant e: students){
            con.accept(e);

        }
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con){
        for (Etudiant e : students) {
            if (pre.test(e))
                con.accept(e);
        }
    }

    @Override
    public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun){
        String names = "";
        for (Etudiant e:students){
            names += " " + fun.apply(s);
        }
        return names;
    }

    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup){
        return sup.get() ;
    }

    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com){
        Collections.sort(students, com);
        return students;
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> students){
        return students.stream();
    }
}
