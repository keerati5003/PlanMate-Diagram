@Entity
@Table(name = "study_groups")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudyGroup {
    @Id
    private UUID groupId;

    private String groupName;

    @Column(unique = true)
    private String groupCode;

    private Timestamp createdAt;
}
