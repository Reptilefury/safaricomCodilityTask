package com.safaricom.task.safaricomTask.model;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Report extends  Document{
    @Id
    private long id;

    @OneToOne
    @JoinColumn(name = "document_id") // Specify the foreign key column
    private Document document;
}