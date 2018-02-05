# Patient Record - jBPM Case Management


A case project with human tasks and different milestones. <br>It shows:
 - Case mgm features
 - Case file definition
 - Milestones
 - Case users and groups
 - Case conditions
 - Case role assignments vs Human tasks role assignments
 - Case data and business rules
 - Case dynamic human tasks
 - Sub cases
 - BPMN Human tasks
 - BPMN signals and sub processes

## Patient Record - Case overview

![alt text](https://github.com/hifly81/patientrecord/blob/master/src/main/resources/com/redhat/patientrecord/patientrecord.patientrecord-svg.svg)

## Patient Record - Case assignments

Owner:
 - Hospital Administrator

Groups:
 - E.R
 - Medical unit
 - ExternalMedicalUnit
 - Staff
 - Patient

## Patient Record - Case Milestones

#### Milestone 1 - Patient in the emergency room<br>
 Case activities:
 - Emergency department record form (Staff)
 - ER admission approval (ER)
 - ER final diagnosis (ER)

#### Milestone 2 - Admission to the hospital<br>
 Case activities:
 - Hospital Admission
 - Checkup, analisys (MedicalUnit)
 - DiseaseTrackingSubcase (Staff)
 - External Consultation Evaluation (ExternalMedicalUnit)
 - Hospital checkout

#### Milestone - Patient discharge<br>
 Case activities:
 - Discharge (Staff)

#### Milestone - Patient survey<br>
 Case activities:
 - Survey (Patient)

## Patient Record - Case implementation notes

External Consultation Evaluation is a Business Rule Task; if the conditions are 
"true" it creates a dynamic User Task assigned to case role "ExternalMedicalUnit".

Disease Tracking is a sub case with user task assigned to "Staff".

Only Milestone 1 is in autostart mode.
