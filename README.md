Student Management System

The Student Management System demonstrates the application of key SOLID principles, particularly the Single Responsibility Principle (SRP) and the Liskov Substitution Principle (LSP).
According to SRP, each class is designed to have one clear and focused responsibility.
The Student class defines the common structure and shared behavior for all student types. 
The UndergraduateStudent class manages undergraduate-specific data and tuition calculations, while the GraduateStudent class handles logic unique to graduate students. 
Additionally, the Builder classes are responsible solely for constructing student objects, separating object creation from business logic. 
For example, the calculateTuition() method, which computes tuition based on credit hours and scholarship amount, is implemented within the relevant student class to ensure that tuition logic is not mixed with unrelated functionality.
The system also follows the Liskov Substitution Principle, which states that objects of derived classes should be usable wherever their base class is expected.
In this design, both UndergraduateStudent and GraduateStudent can be referenced as type Student, allowing them to be used interchangeably through polymorphism.
For instance, creating objects using Student undergrad = new UndergraduateStudent.Builder().build(); and Student graduate = new GraduateStudent.Builder().build(); demonstrates that both subclasses can function correctly when treated as Student objects. 
This approach ensures flexibility, maintainability, and proper object-oriented design within the system.
