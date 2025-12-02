# IndiBite - Full Stack Restaurant Application

IndiBite is a full-stack restaurant website showcasing authentic Indian cuisine with a Spring Boot backend and dynamic frontend.

## 🚀 Features

- **Home Page**: Welcome page with specials and weekend offers
- **Dynamic Menu**: Menu items fetched from backend with "Add to Cart" functionality
- **Build Your Own Thali**: Interactive page to select and customize thali components
- **Order System**: Complete cart management and checkout with backend integration

## 📋 Prerequisites

- **Java 17** or higher (✅ Already installed: Java 17.0.12)
- **Maven 3.6+** (Required for building)
- **Modern Web Browser**

## 🛠️ Project Structure

```
IndiBite/
├── src/
│   ├── main/
│   │   ├── java/com/indibite/
│   │   │   ├── IndiBiteApplication.java (Main Spring Boot class)
│   │   │   ├── config/
│   │   │   │   └── DataInitializer.java (Populates menu data)
│   │   │   ├── controller/
│   │   │   │   ├── MenuController.java (Menu API)
│   │   │   │   └── OrderController.java (Order API)
│   │   │   ├── dto/
│   │   │   │   ├── OrderRequest.java
│   │   │   │   └── OrderItemRequest.java
│   │   │   ├── model/
│   │   │   │   ├── MenuItem.java
│   │   │   │   ├── Order.java
│   │   │   │   └── OrderItem.java
│   │   │   ├── repository/
│   │   │   │   ├── MenuItemRepository.java
│   │   │   │   └── OrderRepository.java
│   │   │   └── service/
│   │   │       └── OrderService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/ (Frontend files)
│   │           ├── index.html (Home page)
│   │           ├── menu.html (Menu page)
│   │           ├── thali.html (Thali builder)
│   │           ├── order.html (Cart & checkout)
│   │           ├── *.css (Stylesheets)
│   │           └── *.png (Images)
└── pom.xml
```

## 🏃 How to Run

### Option 1: Using Maven Command Line

```bash
# Build and run
mvn clean spring-boot:run
```

### Option 2: Using IDE (Recommended)

#### IntelliJ IDEA:
1. Open the project in IntelliJ IDEA
2. Wait for Maven dependencies to download
3. Right-click on `IndiBiteApplication.java`
4. Select "Run 'IndiBiteApplication'"

#### VS Code:
1. Install "Extension Pack for Java" and "Spring Boot Extension Pack"
2. Open the project folder
3. Press F5 or click "Run" on `IndiBiteApplication.java`

#### Eclipse:
1. Import as "Existing Maven Project"
2. Right-click on project → Run As → Spring Boot App

### Option 3: Build JAR and Run

```bash
# Build the JAR
mvn clean package

# Run the JAR
java -jar target/IndiBite-0.0.1-SNAPSHOT.jar
```

## 🌐 Access the Application

Once the application starts successfully, you'll see:

```
Started IndiBiteApplication in X.XXX seconds
```

Then open your browser and navigate to:

**http://localhost:8080**

The application will automatically redirect to the home page.

## 📡 API Endpoints

### Menu APIs
- `GET /api/menu` - Get all menu items
- `GET /api/menu/{category}` - Get items by category
  - Categories: "Starters", "Main Course", "Desserts", "Thali Component"

### Order APIs
- `POST /api/orders` - Place a new order
  - Request body:
    ```json
    {
      "customerName": "John Doe",
      "customerPhone": "1234567890",
      "customerAddress": "123 Main St",
      "items": [
        {"menuItemId": 1, "quantity": 2},
        {"menuItemId": 3, "quantity": 1}
      ]
    }
    ```

## 🗄️ Database

The application uses an **in-memory H2 database** that is automatically initialized with menu data on startup.

### H2 Console Access
- URL: http://localhost:8080/h2-console
- JDBC URL: `jdbc:h2:mem:indibitedb`
- Username: `sa`
- Password: `password`

## 🎨 Frontend Features

### Shopping Cart
- Items are stored in browser's localStorage
- Persists across page refreshes
- Can add items from both Menu and Thali pages

### Dynamic Content
- Menu items are fetched from the backend API
- Thali components are loaded dynamically
- Real-time cart updates

## 🔧 Technologies Used

### Backend
- Spring Boot 3.2.0
- Spring Data JPA
- H2 Database
- Lombok
- Maven

### Frontend
- HTML5
- CSS3 (Vanilla)
- JavaScript (ES6+)
- LocalStorage API

## 📝 Notes

- The database is in-memory, so all data is reset when the application restarts
- Default port is 8080 (configurable in `application.properties`)
- All static resources are served from `/src/main/resources/static`

## 🐛 Troubleshooting

### Port Already in Use
If port 8080 is already in use, change it in `application.properties`:
```properties
server.port=8081
```

### Maven Not Found
Install Maven from: https://maven.apache.org/download.cgi
Or use your IDE's embedded Maven.

### Dependencies Not Downloading
Run: `mvn clean install -U`

## 👨‍💻 Development

To add new menu items, edit `DataInitializer.java` and restart the application.

---

**Enjoy your IndiBite experience! 🍛**
