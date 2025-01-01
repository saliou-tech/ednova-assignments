
# Assignement-4 Online College API Contract 

This document defines the API contract for an online college system. 
The contract covers three main entities: **Students**, **Courses**, and **Enrollments**.

Each endpoint includes metadata such as creation date, modification date, author, and API version.

---
## **Students**

### **Create a New Student**
**POST** `/students`

    Create a new student record.

#### Request Body:
```json
{
  "firstName": "saliou",
  "lastName": "gueye",
  "email": "saliou@gmail.com",
  "dob": "1995-05-20"
}
```
##### Example of Response 
```
{
  "data": {
    "id": 1,
    "firstName": "saliou",
    "lastName": "gueye",
    "email": "saliou@gmail.com",
    "dob": "1995-05-20",
    "metadata": {
      "created_at": "2024-12-31T12:00:00Z",
      "created_by": "admin",
      "modified_at": "2024-12-31T12:00:00Z",
      "modified_by": "admin",
      "version": "v1"
    }
  }
}
```
### **Get list of All Students**
    GET /students
    
    Retrieve a list of all students.
    
    Response:
    200 OK: List of students.
##### Example of Response
```
        {
        "data": [
            {
            "id": 1,
            "firstName": "saliou",
            "lastName": "gueye",
            "email": "saliou@gmail.com",
            "dob": "1995-05-20",
                "metadata": {
                "created_at": "2024-12-31T12:00:00Z",
                "created_by": "admin",
                "modified_at": "2024-12-31T12:00:00Z",
                "modified_by": "admin",
                "version": "v1"
                }
            },
            {
            "id": 2,
            "firstName": "baba",
            "lastName": "top",
            "email": "baba@gmail.com",
            "dob": "1994-02-15",
                "metadata": {
                "created_at": "2024-12-30T12:00:00Z",
                "created_by": "admin",
                "modified_at": "2024-12-30T12:00:00Z",
                "modified_by": "admin",
                "version": "v1"
                }
            }
         ]
       }

``` 
##### get a specific Student
    GET /students/{studentId}
    
    Retrieve details of a specific student by studentId.
    
    Response:
    200 OK: Student details.
    404 Not Found: Student not found.

##### Example Response:

``` 
{
    "data": {
    "id": 1,
    "firstName": "saliou",
    "lastName": "gueye",
    "email": "salliou@gmail.com",
    "dob": "1995-05-20",
            "metadata": {
            "created_at": "2024-12-31T12:00:00Z",
            "created_by": "admin",
            "modified_at": "2024-12-31T12:00:00Z",
            "modified_by": "admin",
            "version": "v1"
            }
    }
}

``` 

#### Update Student Details
    PUT /students/{studentId}
    
    Update the details of a specific student.
    
    Request Body:
``` 
    {
    "firstName": "baba",
    "lastName": "top",
    "email": "baba@ednova.com",
    "dob": "1995-05-20"
    }
``` 
    Response:
    200 OK: Student details were successfully updated.
    404 Not Found: Student not found.
#### Example of response
``` 
{
    "data": {
    "id": 2,
    "firstName": "baba",
    "lastName": "top",
    "email": "baba@ednova.com",
    "dob": "1995-05-20",
        "metadata": {
        "created_at": "2024-12-31T12:00:00Z",
        "created_by": "admin",
        "modified_at": "2024-12-31T12:15:00Z",
        "modified_by": "admin",
        "version": "v2"
        }
    }
}
``` 

#### Delete a Student

    DELETE /students/{studentId}
    
    Delete a specific student.
    
    Response:
    204 No Content: Student deleted successfully.
    
    404 Not Found: Student not found.

## **Courses**

#### Create a New Course
    POST /courses
    
    Create a new course.
```
    {
    "title": "Introduction to Computer Science",
    "description": "A basic course in computer science",
    "credits": 3
    }

```
    Response:
    201 Created: A new course was created.
    Location: The URI for the newly created course.
    Example Response:

```
        {
            "data": {
            "id": 101,
            "title": "Introduction to Computer Science",
            "description": "A basic course in computer science",
            "credits": 3,
                    "metadata": {
                    "created_at": "2024-12-31T12:00:00Z",
                    "created_by": "admin",
                    "modified_at": "2024-12-31T12:00:00Z",
                    "modified_by": "admin",
                    "version": "v1"
                    }
            }
        }

```

#### Get a List of All Courses
    GET /courses
    
    Retrieve a list of all courses.
    
    Response:
    200 OK: List of courses.
    Example Response:
```
        {
            "data": [
                {
                "id": 101,
                "title": "Introduction to Computer Science",
                "description": "A basic course in computer science",
                "credits": 3,
                    "metadata": {
                    "created_at": "2024-12-31T12:00:00Z",
                    "created_by": "admin",
                    "modified_at": "2024-12-31T12:00:00Z",
                    "modified_by": "admin",
                    "version": "v1"
                    }
                },
                {
                "id": 102,
                "title": "Advanced Web Development",
                "description": "A deep dive into modern web technologies",
                "credits": 4,
                    "metadata": {
                    "created_at": "2024-12-30T12:00:00Z",
                    "created_by": "admin",
                    "modified_at": "2024-12-30T12:00:00Z",
                    "modified_by": "admin",
                    "version": "v1"
                    }
                }
            ]
        }
```
#### Get a Specific Course
    GET /courses/{courseId}
    
    Retrieve details of a specific course by courseId.
    
    Response:
    200 OK: Course details.
    404 Not Found: Course not found.
    Example Response:
```
    {
        "data": {
        "id": 101,
        "title": "Introduction to Computer Science",
        "description": "A basic course in computer science",
        "credits": 3,
        "metadata": {
            "created_at": "2024-12-31T12:00:00Z",
            "created_by": "admin",
            "modified_at": "2024-12-31T12:00:00Z",
            "modified_by": "admin",
            "version": "v1"
        }
        }
}
```
#### Update Course Details
    PUT /courses/{courseId}
    
    Update the details of a specific course.
    
    Request Body:
```
        {
        "title": "Introduction to Computer Science",
        "description": "An introductory course to the fundamentals of computer science",
        "credits": 4
        }
```
    Response:
    200 OK: Course details were successfully updated.
    404 Not Found: Course not found.
    Example Response:
```
    {
        "data": {
        "id": 101,
        "title": "Introduction to Computer Science",
        "description": "An introductory course to the fundamentals of computer science",
        "credits": 4,
            "metadata": {
            "created_at": "2024-12-31T12:00:00Z",
            "created_by": "admin",
            "modified_at": "2024-12-31T12:15:00Z",
            "modified_by": "admin",
            "version": "v2"
            }
        }
    }
```

#### Delete a Course
    DELETE /courses/{courseId}
    
    Delete a specific course.
    
    Response:
    204 No Content: Course deleted successfully.
    404 Not Found: Course not found
#### Enrollments
    Enroll a Student in a Course
    POST /enrollments
    
    Enroll a student in a specific course.
    
    Request Body:
```
    {
    "studentId": 1,
    "courseId": 101
    }
```
    Response:
    201 Created: Enrollment was successful.
    Example Response:
```
    {
        "data": {
        "studentId": 1,
        "courseId": 101,
            "metadata": {
            "created_at": "2024-12-31T12:00:00Z",
            "created_by": "admin",
            "modified_at": "2024-12-31T12:00:00Z",
            "modified_by": "admin",
            "version": "v1"
            }
        }
    }
```
#### Get All Enrollments
    GET /enrollments
    
    Retrieve a list of all enrollments.
    
    Response:
    200 OK: List of enrollments.
    Example Response:
```
    {
        "data": [
                {
                "studentId": 1,
                "courseId": 101,
                        "metadata": {
                        "created_at": "2024-12-31T12:00:00Z",
                        "created_by": "admin",
                        "modified_at": "2024-12-31T12:00:00Z",
                        "modified_by": "admin",
                        "version": "v1"
                        }
                },
                {
                "studentId": 2,
                "courseId": 102,
                        "metadata": {
                        "created_at": "2024-12-30T12:00:00Z",
                        "created_by": "admin",
                        "modified_at": "2024-12-30T12:00:00Z",
                        "modified_by": "admin",
                        "version": "v1"
                        }
                }
        ]
    }
```

#### Remove a Student from a Course
    DELETE /enrollments/{studentId}/{courseId}
    
    Remove a specific student from a course.
    
    Response:
    204 No Content: Enrollment removed successfully.
    404 Not Found: Enrollment not found.

### base url
    https://api.college.com/v1/
