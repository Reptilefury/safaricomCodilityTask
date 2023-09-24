package com.safaricom.task.safaricomTask.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "DOCUMENTS")
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Document {
    @Id
    private long id;
    @Column(name = "REFERENCE_ID")
    private long referenceId;
    @Column(name = "AUTHOR_NAME")
    private String authorName;
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "END_DATE")
    private Date endDate;
    @Column(name = "PAYMENT_DATE")
    private Date paymentDate;
    @Enumerated(EnumType.STRING) // Specify the EnumType as STRING
    @Column(name = "DOC_TYPE") // Map to the column for docType
    private DocType docType;
    public enum DocType {
        REPORT, // Enum value for Report
        INVOICE // Enum value for Invoice
    }
}





