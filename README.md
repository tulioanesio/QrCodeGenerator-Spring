# QRCode Generator

A RESTful API built with Spring Boot that generates QR codes from user-provided text and stores them directly in an Amazon S3 bucket. The QR code generation is handled by Google's ZXing (Zebra Crossing) library.

## Technologies Used

- Java 17+
- Spring Boot 3+
- Spring Boot DevTools
- Amazon S3
- Google's ZXing
- Maven

## Endpoints

Create QrCode
```
REQUEST
POST /api/qrcode

{
	"text": "https://www.google.com/"
}

RESPONSE
{
	"url": "https://qr.code-gen.s3.us-east-1.amazonaws.com/6ce044b8-1aab-4cec-aa53-56609ef7c707"
}
```

## Running the Application

Clone the repository:
```
git clone https://github.com/tulioanesio/QrCodeGenerator-Spring.git
```

Navigate to the project folder:

```
cd QrCodeGenerator-Spring
```

Build and run, the application will be available at:
```
http://localhost:8080
```

Create an file named `.env` with the properties:
```
AWS_ACCESS_KEY_ID=your_acess_key_id
AWS_SECRET_ACCESS_KEY=your_secret_access_key
```

## License

Distributed under the MIT License. See [LICENSE](https://github.com/tulioanesio/QrCodeGenerator-Spring/blob/master/LICENSE) for more information.
