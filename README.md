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

This sample project is used by an administrator to track the admission of a patient to his hospital and the dismissal procedures.
The scenario project begins when a patient goes to the emergency room; the emergency room personnel checks whether the patient needs analysis and a new code is assigned (green, yellow or red).
If a patient needs to be admitted to the hospital, a room is assigned and further analysis and checkups are carried out by hospital staff.
The medical staff decides whether a patient can be dismissed from the hospital. When the patient is dismissed from the hospital, fill out a questionnaire expressing his opinion on admission.
During hospitalization of the patient, external consultants may be requested to be sure of the diagnosis.
Information on the patient's disease and its diagnosis can be traced and sent to external entities (Ministry of Health)


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
