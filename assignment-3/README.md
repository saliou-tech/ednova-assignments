##BASE URL
http://api/v1

## ADD STUDENT
   Méthode : POST
   Endpoint : /students
   ```bash
   Request Body :

   {
      "firstName": "John",
      "lastName": "Doe",
      "email": "john.doe@example.com",
      "dateOfBirth": "1998-06-15"
   }

   RESPONSE
   {  "id"      :1
      "firstName": "John",
      "lastName": "Doe",
      "email": "john.doe@example.com",
      "dateOfBirth": "1998-06-15"
   }
2.Récupérer un étudiant par ID
   Méthode : GET
   Endpoint : /students/{id}
   Response :
      {
         "studentId": "12345",
         "name": "John Doe",
         "email": "john.doe@example.com",
         "dateOfBirth": "2000-01-01",
         "enrollments": [
         {
         "enrollmentId": "67890",
         "courseId": "67890",
         "courseName": "Mathematics 101",
         "enrollmentDate": "2024-12-05T10:20:00Z"
         },
         {
         "enrollmentId": "67891",
         "courseId": "67891",
         "courseName": "Physics 101",
         "enrollmentDate": "2024-12-06T10:20:00Z"
         }
         ]
       }
3. UPDATE A STUDENT 
   Méthode : PUT
   Endpoint : /students/{id}
   Request Body :
   
   {
      "name": "John Smith",
      "email": "john.smith@example.com",
      "dateOfBirth": "2000-01-01"
   }
   Response :

   {
      "studentId": "12345",
      "name": "John Smith",
      "email": "john.smith@example.com",
      "dateOfBirth": "2000-01-01",
      "enrollments": [
         {
         "enrollmentId": "67890",
         "courseId": "67890",
         "courseName": "Mathematics 101",
         "enrollmentDate": "2024-12-05T10:20:00Z"
         },
         {
         "enrollmentId": "67891",
         "courseId": "67891",
         "courseName": "Physics 101",
         "enrollmentDate": "2024-12-06T10:20:00Z"
         }
      ]
   }
4. delete a student 
   Méthode : DELETE
   Endpoint : /students/{id}
   Response :
    {
      "message": "Student successfully deleted"
      }
5. List of students
   Méthode : GET
   Endpoint : /students
 
6. {
   "data": [
   {
   "studentId": "12345",
   "name": "John Doe",
   "email": "john.doe@example.com",
   "dateOfBirth": "2000-01-01",
   "enrollments": [
   {
   "enrollmentId": "67890",
   "courseId": "67890",
   "courseName": "Mathematics 101",
   "enrollmentDate": "2024-12-05T10:20:00Z"
   },
   {
   "enrollmentId": "67891",
   "courseId": "67891",
   "courseName": "Physics 101",
   "enrollmentDate": "2024-12-06T10:20:00Z"
   }
   ]
   },
   {
   "studentId": "12346",
   "name": "Jane Doe",
   "email": "jane.doe@example.com",
   "dateOfBirth": "2001-01-01",
   "enrollments": [
   {
   "enrollmentId": "67892",
   "courseId": "67892",
   "courseName": "Chemistry 101",
   "enrollmentDate": "2024-12-07T10:20:00Z"
   }
   ]
   }
   ],
   "page": 1,
   "size": 2,
   "total": 100
   }
6. Créer un cours
   Méthode : POST
   Endpoint : /courses
   Request Body :
7. {
   "name": "Mathematics 101",
   "description": "An introduction to basic mathematics."
   }
   Response :
   json
   Copier le code
   {
   "courseId": "67890",
   "name": "Mathematics 101",
   "description": "An introduction to basic mathematics."
   }

D'accord ! Si vous souhaitez que l'inscription (enrollment) soit un objet dans une liste plutôt qu'un tableau d'identifiants d'inscription dans l'objet étudiant, voici une révision du design de l'API. Dans ce cas, chaque inscription sera un objet contenant les informations détaillées sur le cours et l'inscription, et non simplement un identifiant.

API Design avec Inscription sous forme d'Objet
Base URL
arduino
Copier le code
https://api.example.com/v1
1. Créer un étudiant
   Méthode : POST
   Endpoint : /students
   Request Body :
   json
   Copier le code
   {
   "name": "John Doe",
   "email": "john.doe@example.com",
   "dateOfBirth": "2000-01-01"
   }
   Response :
   json
   Copier le code
   {
   "studentId": "12345",
   "name": "John Doe",
   "email": "john.doe@example.com",
   "dateOfBirth": "2000-01-01",
   "enrollments": []
   }
   Erreurs :
   400 : Requête invalide (par exemple, email déjà pris).
   500 : Erreur serveur.
2. Récupérer un étudiant par ID
   Méthode : GET
   Endpoint : /students/{id}
   Response :
   json
   Copier le code
   {
   "studentId": "12345",
   "name": "John Doe",
   "email": "john.doe@example.com",
   "dateOfBirth": "2000-01-01",
   "enrollments": [
   {
   "enrollmentId": "67890",
   "courseId": "67890",
   "courseName": "Mathematics 101",
   "enrollmentDate": "2024-12-05T10:20:00Z"
   },
   {
   "enrollmentId": "67891",
   "courseId": "67891",
   "courseName": "Physics 101",
   "enrollmentDate": "2024-12-06T10:20:00Z"
   }
   ]
   }
   Erreurs :
   404 : Étudiant non trouvé.
3. Mettre à jour un étudiant
   Méthode : PUT
   Endpoint : /students/{id}
   Request Body :
   json
   Copier le code
   {
   "name": "John Smith",
   "email": "john.smith@example.com",
   "dateOfBirth": "2000-01-01"
   }
   Response :
   json
   Copier le code
   {
   "studentId": "12345",
   "name": "John Smith",
   "email": "john.smith@example.com",
   "dateOfBirth": "2000-01-01",
   "enrollments": [
   {
   "enrollmentId": "67890",
   "courseId": "67890",
   "courseName": "Mathematics 101",
   "enrollmentDate": "2024-12-05T10:20:00Z"
   },
   {
   "enrollmentId": "67891",
   "courseId": "67891",
   "courseName": "Physics 101",
   "enrollmentDate": "2024-12-06T10:20:00Z"
   }
   ]
   }
   Erreurs :
   400 : Requête invalide.
   404 : Étudiant non trouvé.
4. Supprimer un étudiant
   Méthode : DELETE
   Endpoint : /students/{id}
   Response :
   json
   Copier le code
   {
   "message": "Student successfully deleted"
   }
   Erreurs :
   404 : Étudiant non trouvé.
5. Lister les étudiants
   Méthode : GET
   Endpoint : /students
   Query Params :
   page : Numéro de page (facultatif).
   size : Taille de la page (facultatif).
   Response :
   json
   Copier le code
   {
   "data": [
   {
   "studentId": "12345",
   "name": "John Doe",
   "email": "john.doe@example.com",
   "dateOfBirth": "2000-01-01",
   "enrollments": [
   {
   "enrollmentId": "67890",
   "courseId": "67890",
   "courseName": "Mathematics 101",
   "enrollmentDate": "2024-12-05T10:20:00Z"
   },
   {
   "enrollmentId": "67891",
   "courseId": "67891",
   "courseName": "Physics 101",
   "enrollmentDate": "2024-12-06T10:20:00Z"
   }
   ]
   },
   {
   "studentId": "12346",
   "name": "Jane Doe",
   "email": "jane.doe@example.com",
   "dateOfBirth": "2001-01-01",
   "enrollments": [
   {
   "enrollmentId": "67892",
   "courseId": "67892",
   "courseName": "Chemistry 101",
   "enrollmentDate": "2024-12-07T10:20:00Z"
   }
   ]
   }
   ],
   "page": 1,
   "size": 2,
   "total": 100
   }
   Erreurs :
   500 : Erreur interne.
6. Créer un cours
   Méthode : POST
   Endpoint : /courses
   Request Body :
   json
   Copier le code
   {
   "name": "Mathematics 101",
   "description": "An introduction to basic mathematics."
   }
   Response :
   json
   Copier le code
   {
   "courseId": "67890",
   "name": "Mathematics 101",
   "description": "An introduction to basic mathematics."
   }
   Erreurs :
   400 : Requête invalide.
7. Inscrire un étudiant à un cours
   Méthode : POST
   Endpoint : /enrollments
   Request Body :
8. {
   "studentId": "12345",
   "courseId": "67890"
   }
RESONSE
9. {
   "enrollmentId": "67890",
   "studentId": "12345",
   "courseId": "67890",
   "courseName": "Mathematics 101",
   "enrollmentDate": "2024-12-05T10:20:00Z",
   "createdAt": "2024-12-05T10:20:00Z",
   "updatedAt": "2024-12-05T10:20:00Z",
   "updatedBy": "admin123"
   }
8. Récupérer les inscriptions d'un étudiant
   Méthode : GET
   Endpoint : /students/{studentId}/enrollments
   Response :
9. {
   "studentId": "12345",
   "enrollments": [
   {
   "enrollmentId": "67890",
   "courseId": "67890",
   "courseName": "Mathematics 101",
   "enrollmentDate": "2024-12-05T10:20:00Z"
   },
   {
   "enrollmentId": "67891",
   "courseId": "67891",
   "courseName": "Physics 101",
   "enrollmentDate": "2024-12-06T10:20:00Z"
   }
   ]
   }
9. Supprimer une inscription
   Méthode : DELETE
   Endpoint : /enrollments/{enrollmentId}
   Response :
10. {
    "message": "Enrollment successfully deleted"
    }
    Table d'association Enrollments
    Chaque inscription contient les informations suivantes :

enrollmentId : Identifiant de l'inscription.
studentId : Identifiant de l'étudiant.
courseId : Identifiant du cours.
courseName : Nom du cours.
enrollmentDate : Date de l'inscription.
createdAt, updatedAt, et updatedBy : Métadonnées pour la gestion des dates de création et de mise à jour.