# hospital-management-system
<br>
<br>

# UML

![image](https://github.com/Ahmad-Alqattu/hospital-management-system/assets/19889053/496256c2-5177-418d-8a41-2c3b847e6ee7)

<br>
<br>
<br>
<br>

# Doctors

| Method | URL                           | HTTP Status | Description                  | Sample Request                                                         | Sample Response                                                                                                                   |
|--------|-------------------------------|--------------|------------------------------|------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|
| GET    | http://localhost:8080/api/doctors   | 200 OK       | Get All Doctors              | GET http://localhost:8080/api/doctors                                 | [{"dr_id": 1,<br>"dname": "Dr. Smith",<br>"phone": 123456789,<br>"insurance_id": 12345,<br>"email": "drsmith@example.com",<br>"dob": "1980-01-01"},<br>{"dr_id": 2,<br>"dname": "Dr. Johnson",<br>"phone": 987654321,<br>"insurance_id": 54321,<br>"email": "drjohnson@example.com",<br>"dob": "1975-05-10"}] |
| GET    | http://localhost:8080/api/doctors/{id} | 200 OK       | Get doctor by id             | GET http://localhost:8080/api/doctors/1                               | {"dr_id": 1,<br>"dname": "Dr. Smith",<br>"phone": 123456789,<br>"insurance_id": 12345,<br>"email": "drsmith@example.com",<br>"dob": "1980-01-01"} |
| POST   | http://localhost:8080/api/doctors   | 201 Created  | Create new doctor            | POST http://localhost:8080/api/doctors<br>{"dname": "Dr. Smith",<br>"phone": 123456789,<br>"insurance_id": 12345,<br>"email": "drsmith@example.com",<br>"dob": "1980-01-01"} | {"dr_id": 3,<br>"dname": "Dr. Smith",<br>"phone": 123456789,<br>"insurance_id": 12345,<br>"email": "drsmith@example.com",<br>"dob": "1980-01-01"} |
| PUT    | http://localhost:8080/api/doctors/{id} | 200 OK       | Update existing doctor with id | PUT http://localhost:8080/api/doctors/1<br>{"dname": "Dr. ahmad",<br>"phone": 123456789}                           | {"dr_id": 1,<br>"dname": "Dr. ahmad",<br>"phone": 123456789,<br>"insurance_id": 0,<br>"email": null,<br>"dob": null}                     |
| DELETE | http://localhost:8080/api/doctors/{id} | 200 OK       | Delete doctor by id          | DELETE http://localhost:8080/api/doctors/3                            | "Deleted successfully."                                                                                                           |


<br>
<br>
<br>
<br>

# Medical Records

| Method | URL                                         | HTTP Status | Description                   | Sample Request                                                                         | Sample Response                                                                                                                                                 |
|--------|---------------------------------------------|--------------|-------------------------------|----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| GET    | http://localhost:8080/api/medical-records     | 200 OK       | Get All medical records       | GET http://localhost:8080/api/medical-records                                         | [{"medical_id": 1,<br>"diagnosis": "Lorem ipsum dolor sit amet",<br>"treatments": "Consectetur adipiscing elit",<br>"medications": "Sed do eiusmod tempor incididunt",<br>"testResults": "Ut labore et dolore magna aliqua"},<br>{"medical_id": 2,<br>"diagnosis": "Duis aute irure dolor in reprehenderit",<br>"treatments": "Excepteur sint occaecat cupidatat non proident",<br>"medications": "Sunt in culpa qui officia deserunt mollit anim",<br>"testResults": "Lorem ipsum dolor sit amet"}] |
| GET    | http://localhost:8080/api/medical-records/{id} | 200 OK       | Get medical record by id      | GET http://localhost:8080/api/medical-records/1                                       | {"medical_id": 1,<br>"diagnosis": "Lorem ipsum dolor sit amet",<br>"treatments": "Consectetur adipiscing elit",<br>"medications": "Sed do eiusmod tempor incididunt",<br>"testResults": "Ut labore et dolore magna aliqua"}                           |
| POST   | http://localhost:8080/api/medical-records     | 201 Created  | Create new medical record     | POST http://localhost:8080/api/medical-records<br>{"diagnosis": "hhhjj",<br>"testResults": "good"} | {"medical_id": 3,<br>"diagnosis": "hhhjj",<br>"treatments": null,<br>"medications": null,<br>"testResults": "good"}                                                          |
| PUT    | http://localhost:8080/api/medical-records/{id} | 200 OK       | Update existing record by id  | PUT http://localhost:8080/api/medical-records/1<br>{"diagnosis": "hhhjj",<br>"treatments": "one time",<br>"testResults": "good"}   | {"medical_id": 1,<br>"diagnosis": "hhhjj",<br>"treatments": "one time",<br>"medications": null,<br>"testResults": "good"}                                                      |
| DELETE | http://localhost:8080/api/medical-records/{id} | 200 OK       | Delete record by id           | DELETE http://localhost:8080/api/medical-records/4                                      | "Deleted successfully."                                                                                                                                         |
<br>
<br>
<br>
<br>

# Patients

| Method | URL                                         | HTTP Status | Description                   | Sample Request                                                                         | Sample Response                                                                                                                                                 |
|--------|---------------------------------------------|--------------|-------------------------------|----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| GET    | http://localhost:8080/api/patients          | 200 OK       | Get All patients              | GET http://localhost:8080/api/patients                                                  | [{"patient_id": 1<br>"p_name": "John Doe"<br>"phone": 123456789<br>"email": "johndoe@example.com"<br>"insuranceID": 54321<br>"dob": "1990-01-01T00:00:00.000+00:00"}<br>{"patient_id": 2<br>"p_name": "Jane Smith"<br>"phone": 987654321<br>"email": "janesmith@example.com"<br>"insuranceID": 12345<br>"dob": "1985-05-10T00:00:00.000+00:00"}] |
| GET    | http://localhost:8080/api/patients/{id}     | 200 OK       | Get patient by id             | GET http://localhost:8080/api/patients/1                                                | {"patient_id": 1<br>"p_name": "John Doe"<br>"phone": 123456789<br>"email": "johndoe@example.com"<br>"insuranceID": 54321<br>"dob": "1990-01-01T00:00:00.000+00:00"}                  |
| POST   | http://localhost:8080/api/patients          | 201 Created  | Create new patient            | POST http://localhost:8080/api/patients<br>{"p_name": "ahmad Doe"<br>"phone": 123456789<br>"email": "johndoe@example.com"<br>"insuranceID": 54321<br>"dob": "1990-01-01T00:00:00.000+00:00"} | {"patient_id": 3<br>"p_name": "ahmad Doe"<br>"phone": 123456789<br>"email": "johndoe@example.com"<br>"insuranceID": 54321<br>"dob": "1990-01-01T00:00:00.000+00:00"}                  |
| PUT    | http://localhost:8080/api/patients/{id}     | 200 OK       | Update existing patient by id | PUT http://localhost:8080/api/patients/1<br>{"p_name": "ahmadluay Doe"<br>"phone": 343<br>"insuranceID": 54321}                                        | {"patient_id": 1<br>"p_name": "ahmadluay Doe"<br>"phone": 343<br>"email": null<br>"insuranceID": 54321<br>"dob": null}                                                      |
| DELETE | http://localhost:8080/api/patients/{id}     | 200 OK       | Delete patient by id          | DELETE http://localhost:8080/api/patients/3                                             | "Deleted successfully."                                                                                                                                         |
<br>
<br>
<br>

# Appointment

| Method | URL                                             | HTTP Status | Description                  | Sample Request                                                                                                | Sample Response                                                                                                                                                 |
|--------|-------------------------------------------------|--------------|------------------------------|---------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| GET    | http://localhost:8080/api/appointments          | 200 OK       | Get all appointments         | GET http://localhost:8080/api/appointments                                                                    | [{"appointment_id": 1,<br>"patient_id": 1,<br>"doctor_id": 1,<br>"appointment_date": "2023-05-24T10:00:00.000+00:00"}]                                                   |
| GET    | http://localhost:8080/api/appointments/{id}     | 200 OK       | Get appointment by id        | GET http://localhost:8080/api/appointments/1                                                                  | {"appointment_id": 1,<br>"patient_id": 1,<br>"doctor_id": 1,<br>"appointment_date": "2023-05-24T10:00:00.000+00:00"}                                                      |
| POST   | http://localhost:8080/api/appointments          | 201 Created  | Create new appointment       | POST http://localhost:8080/api/appointments<br>{"patient_id": 1,<br>"doctor_id": 2,<br>"appointment_date": "2023-05-25T14:30:00.000+00:00"}                                     | {"appointment_id": 2,<br>"patient_id": 1,<br>"doctor_id": 2,<br>"appointment_date": "2023-05-25T14:30:00.000+00:00"}                                                      |
| PUT    | http://localhost:8080/api/appointments/{id}     | 200 OK       | Update appointment by id     | PUT http://localhost:8080/api/appointments/1<br>{"appointment_date": "2023-05-26T09:30:00.000+00:00"}           | {"appointment_id": 1,<br>"patient_id": 1,<br>"doctor_id": 1,<br>"appointment_date": "2023-05-26T09:30:00.000+00:00"}                                                      |
| DELETE | http://localhost:8080/api/appointments/{id}     | 200 OK       | Delete appointment by id     | DELETE http://localhost:8080/api/appointments/2                                                              | "Deleted successfully."                                                                                                                                         |






