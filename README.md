# NotesApp - Spring Boot OAuth2 + JWT Demo

A simple Spring Boot application that demonstrates:
- REST API development
- Google OAuth2 login with OpenID Connect (OIDC)
- Identity-based access to user-specific data
- JWT token inspection
- Authorization via email/domain restrictions

## 🚀 Features

- ✅ Login with Google (OAuth2)
- ✅ Protect `/notes` endpoint for authenticated users
- ✅ Show current user identity via `/whoami`
- ✅ View raw ID token via `/token`
- ✅ Admin-only endpoint at `/admin`
- ✅ Custom authorization using email or domain logic

## 🛠️ Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Security
- OAuth2 Client (Google)
- H2 In-Memory Database
- Maven

## 🧪 Endpoints

| Endpoint | Description |
|----------|-------------|
| `/notes` | CRUD for notes (auth required) |
| `/whoami` | Returns current logged-in user info |
| `/token` | Shows JWT ID token issued by Google |
| `/admin` | Only accessible by certain email/domain |


## 📂 Run Locally

```bash
git clone https://github.com/kimiya66/notesapp-oauth2-jwt-.git
cd notesapp-oauth2-jwt-
./mvnw spring-boot:run
