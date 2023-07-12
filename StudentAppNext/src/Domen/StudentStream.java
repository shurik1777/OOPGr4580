package Domen;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    public List<StudentGroup> streams;
    public int IDStream;

    /**
     * Конструктор класса StudentStream
     *
     * @param NumStream номер потока
     */
    public StudentStream(int NumStream) {
        this.streams = new ArrayList<>();
        this.IDStream = NumStream;
    }

    /**
     * Метод для добавления потока студентов
     *
     * @param stream объект класса StudentGroup, представляющий поток студентов
     */
    public void addStream(StudentGroup stream) {
        this.streams.add(stream);
    }

    /**
     * Метод для получения идентификатора потока
     *
     * @return идентификатор потока
     */
    public int getIdStream() {
        return IDStream;
    }

    /**
     * Метод для получения списка потоков студентов
     *
     * @return список потоков студентов
     */
    public List<StudentGroup> getStream() {
        return streams;
    }

    /**
     * Переопределение метода toString для вывода информации о потоках студентов
     *
     * @return строковое представление объекта StudentStream
     */
    @Override
    public String toString() {
        String streamOutput = new String();
        streamOutput = String.format("\n№Потока %d", getIdStream());
        for (StudentGroup studentGroup : streams) {
            streamOutput = streamOutput + "\n" + studentGroup.getStudent() + "\n";
        }
        return streamOutput;
    }

    /**
     * Переопределение метода iterator для поддержки итерации по объекту StudentStream
     *
     * @return итератор, позволяющий перебирать элементы потоков студентов
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < streams.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return streams.get(index++);
            }
        };
    }
}
