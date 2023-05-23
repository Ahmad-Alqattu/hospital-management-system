# hospital-management-system



![image](https://github.com/Ahmad-Alqattu/hospital-management-system/assets/19889053/f5442166-3cde-4466-b690-67549075c1eb)

# Doctors
| Method | URL                           | HTTP Status | Description                  | Sample Request                                                         | Sample Response                                                                                                                   |
|--------|-------------------------------|--------------|------------------------------|------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|
| GET    | http://localhost:8080/api/doctors   | 200 OK       | Get All Doctors              | GET http://localhost:8080/api/doctors                                 | [{"dr_id": 1,<br>"dname": "Dr. Smith",<br>"phone": 123456789,<br>"insurance_id": 12345,<br>"email": "drsmith@example.com",<br>"dob": "1980-01-01"},<br>{"dr_id": 2,<br>"dname": "Dr. Johnson",<br>"phone": 987654321,<br>"insurance_id": 54321,<br>"email": "drjohnson@example.com",<br>"dob": "1975-05-10"}] |
| GET    | http://localhost:8080/api/doctors/{id} | 200 OK       | Get doctor by id             | GET http://localhost:8080/api/doctors/1                               | {"dr_id": 1,<br>"dname": "Dr. Smith",<br>"phone": 123456789,<br>"insurance_id": 12345,<br>"email": "drsmith@example.com",<br>"dob": "1980-01-01"} |
| POST   | http://localhost:8080/api/doctors   | 201 Created  | Create new doctor            | POST http://localhost:8080/api/doctors<br>{"dname": "Dr. Smith",<br>"phone": 123456789,<br>"insurance_id": 12345,<br>"email": "drsmith@example.com",<br>"dob": "1980-01-01"} | {"dr_id": 3,<br>"dname": "Dr. Smith",<br>"phone": 123456789,<br>"insurance_id": 12345,<br>"email": "drsmith@example.com",<br>"dob": "1980-01-01"} |
| PUT    | http://localhost:8080/api/doctors/{id} | 200 OK       | Update existing doctor with id | PUT http://localhost:8080/api/doctors/1<br>{"dname": "Dr. ahmad",<br>"phone": 123456789}                           | {"dr_id": 1,<br>"dname": "Dr. ahmad",<br>"phone": 123456789,<br>"insurance_id": 0,<br>"email": null,<br>"dob": null}                     |
| DELETE | http://localhost:8080/api/doctors/{id} | 200 OK       | Delete doctor by id          | DELETE http://localhost:8080/api/doctors/3                            | "Deleted successfully."                                                                                                           |



# Medical Records
| Method | URL                                         | HTTP Status | Description                   | Sample Request                                                                         | Sample Response                                                                                                                                                 |
|--------|---------------------------------------------|--------------|-------------------------------|----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| GET    | http://localhost:8080/api/medical-records     | 200 OK       | Get All medical records       | GET http://localhost:8080/api/medical-records                                         | [{"medical_id": 1,<br>"diagnosis": "Lorem ipsum dolor sit amet",<br>"treatments": "Consectetur adipiscing elit",<br>"medications": "Sed do eiusmod tempor incididunt",<br>"testResults": "Ut labore et dolore magna aliqua"},<br>{"medical_id": 2,<br>"diagnosis": "Duis aute irure dolor in reprehenderit",<br>"treatments": "Excepteur sint occaecat cupidatat non proident",<br>"medications": "Sunt in culpa qui officia deserunt mollit anim",<br>"testResults": "Lorem ipsum dolor sit amet"}] |
| GET    | http://localhost:8080/api/medical-records/{id} | 200 OK       | Get medical record by id      | GET http://localhost:8080/api/medical-records/1                                       | {"medical_id": 1,<br>"diagnosis": "Lorem ipsum dolor sit amet",<br>"treatments": "Consectetur adipiscing elit",<br>"medications": "Sed do eiusmod tempor incididunt",<br>"testResults": "Ut labore et dolore magna aliqua"}                           |
| POST   | http://localhost:8080/api/medical-records     | 201 Created  | Create new medical record     | POST http://localhost:8080/api/medical-records<br>{"diagnosis": "hhhjj",<br>"testResults": "good"} | {"medical_id": 3,<br>"diagnosis": "hhhjj",<br>"treatments": null,<br>"medications": null,<br>"testResults": "good"}                                                          |
| PUT    | http://localhost:8080/api/medical-records/{id} | 200 OK       | Update existing record by id  | PUT http://localhost:8080/api/medical-records/1<br>{"diagnosis": "hhhjj",<br>"treatments": "one time",<br>"testResults": "good"}   | {"medical_id": 1,<br>"diagnosis": "hhhjj",<br>"treatments": "one time",<br>"medications": null,<br>"testResults": "good"}                                                      |
| DELETE | http://localhost:8080/api/medical-records/{id} | 200 OK       | Delete record by id           | DELETE http://localhost:8080/api/medical-records/4                                      | "Deleted successfully."                                                                                                                                         |












| Method | URL               | HTTP Status   | Description        | Sample Request          | Sample Response                                 |
|--------|-------------------|---------------|------------------|------------------------|-------------------------------------------------|
| GET    | /api/appointment  | 200 OK        | Get all appointments  | GET /api/appointment    | [{"id": 1, "time": "09:00 AM"}, {"id": 2, "time": "02:30 PM"}] |
| GET    | /api/appointment/{id} | 200 OK   | Get appointment by ID | GET /api/appointment/1  | {"id": 1, "time": "09:00 AM"}                   |
| POST   | /api/appointment  | 201 Created   | Create a new appointment | POST /api/appointment   | {"success": true}                               |
| PUT    | /api/appointment/{id} | 200 OK   | Update appointment by ID | PUT /api/appointment/1  | {"success": true}                               |
| DELETE | /api/appointment/{id} | 204 No Content | Delete appointment by ID | DELETE /api/appointment/1 | -                                               |

| Method | URL               | HTTP Status   | Description        | Sample Request          | Sample Response                                 |
|--------|-------------------|---------------|------------------|------------------------|-------------------------------------------------|
| GET    | /api/patient      | 200 OK        | Get all patients      | GET /api/patient        | [{"id": 1, "name": "John"}, {"id": 2, "name": "Jane"}] |
| GET    | /api/patient/{id} | 200 OK        | Get patient by ID      | GET /api/patient/1      | {"id": 1, "name": "John"}                        |
| POST   | /api/patient      | 201 Created   | Create a new patient   | POST /api/patient       | {"success": true}                               |
| PUT    | /api/patient/{id} | 200 OK        | Update patient by ID   | PUT /api/patient/1      | {"success": true}                               |
| DELETE | /api/patient/{id} | 204 No Content | Delete patient by ID   | DELETE /api/patient/1   | -                                               |

| Method | URL               | HTTP Status   | Description        | Sample Request          | Sample Response                                 |
|--------|-------------------|---------------|------------------|------------------------|-------------------------------------------------|
| GET    | /api/medicalrecord   | 200 OK        | Get all medical records   | GET /api/medicalrecord    | [{"id": 1, "patientId": 1, "record": "Lorem ipsum"}, {"id": 2, "patientId": 2, "record": "Dolor sit amet"}] |
| GET    | /api/medicalrecord/{id} | 200 OK   | Get medical record by ID  | GET /api/medicalrecord/1  | {"id": 1, "patientId": 1, "record": "Lorem ipsum"} |
| POST   | /api/medicalrecord   | 201 Created   | Create a new medical record | POST /api/medicalrecord   | {"success": true}                               |
| PUT    | /api/medicalrecord/{id} | 200 OK   | Update medical record by ID | PUT /api/medicalrecord/1  | {"success": true}                               |
| DELETE | /api/medicalrecord/{id} | 204 No Content | Delete medical record by ID | DELETE /api/medicalrecord/1 | -                                               |

| Method | URL               | HTTP Status   | Description        | Sample Request          | Sample Response                                 |
|--------|-------------------|---------------|------------------|------------------------|-------------------------------------------------|
| GET    | /api/doctor       | 200 OK        | Get all doctors       | GET /api/doctor         | [{"id": 1, "name": "Dr. Smith"}, {"id": 2, "name": "Dr. Johnson"}] |
| GET    | /api/doctor/{id}  | 200 OK        | Get doctor by ID       | GET /api/doctor/1       | {"id": 1, "name": "Dr. Smith"}                   |
| POST   | /api/doctor       | 201 Created   | Create a new doctor    | POST /api/doctor        | {"success": true}                               |
| PUT    | /api/doctor/{id}  | 200 OK        | Update doctor by ID    | PUT /api/doctor/1       | {"success": true}                               |
| DELETE | /api/doctor/{id}  | 204 No Content | Delete doctor by ID    | DELETE /api/doctor/1    | -                                               |

