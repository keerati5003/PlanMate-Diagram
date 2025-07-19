@Entity
@Table(name = "group_progress")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class GroupProgressSnapshot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private StudyGroup group;

    @ManyToOne
    private User user;

    private Integer completedTasks;
    private Integer focusHours;

    private LocalDateTime calculatedAt;
}
