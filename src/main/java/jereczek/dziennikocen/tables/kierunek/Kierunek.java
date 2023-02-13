package jereczek.dziennikocen.tables.kierunek;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="kierunek")
public class Kierunek {
    @Id
    @Column(name = "nazwa_kier")
    private String nazwaKier;

}
