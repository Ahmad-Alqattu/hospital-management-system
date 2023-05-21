# hospital-management-system



![image](https://github.com/Ahmad-Alqattu/hospital-management-system/assets/19889053/f5442166-3cde-4466-b690-67549075c1eb)

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

