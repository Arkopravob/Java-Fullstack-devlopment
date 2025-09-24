# Portfolio - Fullstack Developer & Media Editor

A unique and professional fullstack portfolio website showcasing development and media editing skills with complete backend functionality.

## ✨ **Features**

### 🎨 **Frontend Design & UI**

- **Unique Professional Design**: Rich color scheme with purple/indigo gradients
- **Dark/Light Mode**: Toggle between themes with smooth transitions
- **Responsive Design**: Fully optimized for all device sizes
- **Modern Typography**: Orbitron for headings, Inter for body text
- **Interactive Animations**: Scroll-triggered animations and hover effects

### 🔧 **Backend Functionality**

- **RESTful API**: Complete API with CRUD operations
- **Database Integration**: MongoDB with Mongoose ODM
- **Contact Management**: Real-time contact form processing with email notifications
- **Admin Dashboard**: Complete admin panel for managing portfolio data
- **Security Features**: Rate limiting, CORS, helmet security, input validation
- **Email Integration**: Automated email notifications for contact forms

### 📱 **Portfolio Sections**

- **Hero Section**: Eye-catching introduction with code window visual
- **About Section**: Professional cards with profile image and animated statistics
- **Skills Section**: Categorized skills with hover effects
- **Certifications Section**: Showcase of professional certifications and achievements
- **Projects Section**: Project cards with overlay effects
- **Contact Section**: Interactive form with real backend processing

### 🛠 **Technical Stack**

#### Frontend
- **HTML5**: Semantic structure with accessibility features
- **CSS3**: Custom properties, animations, and responsive design
- **Vanilla JavaScript**: Clean, efficient code with no dependencies
- **Font Awesome**: Professional icons
- **Google Fonts**: Modern typography

#### Backend
- **Node.js**: Runtime environment
- **Express.js**: Web application framework
- **MongoDB**: NoSQL database with Mongoose ODM
- **Security**: Helmet, CORS, rate limiting
- **Email**: Nodemailer for notifications
- **Environment**: dotenv for configuration

## 🚀 **Quick Start**

### 1. **Initial Setup**
```bash
# Clone or download the portfolio files
cd portfolio

# Run the automated setup script
node setup.js

# Follow the prompts to configure your environment
```

### 2. **Install Dependencies**
```bash
# Install backend dependencies
npm install

# Verify installation
npm list --depth=0
```

### 3. **Configure Environment**
```bash
# Copy environment template
cp .env.example .env

# Edit .env with your configuration
nano .env  # or use your preferred editor
```

### 4. **Start Services**
```bash
# Terminal 1: Start the backend server
npm run dev

# Terminal 2: Start the frontend server
npx http-server . -p 8000

# Terminal 3: Access admin dashboard
# Open http://localhost:5000/admin.html
```

### 5. **Verify Installation**
- **Portfolio**: http://localhost:8000
- **Admin Dashboard**: http://localhost:5000/admin.html
- **API Health**: http://localhost:5000/api/health

## 🔗 **API Endpoints**

### Contact Management
- `POST /api/contact` - Submit contact form
- `GET /api/admin/contacts/stats` - Get contact statistics
- `GET /api/admin/contacts/recent` - Get recent contacts
- `PATCH /api/admin/contacts/:id/status` - Update contact status

### Data Retrieval
- `GET /api/projects` - Get all projects
- `GET /api/projects/featured` - Get featured projects
- `GET /api/certifications` - Get all certifications

### System Status
- `GET /api/health` - Health check and server status

### Request Examples

#### Contact Form Submission
```javascript
POST /api/contact
Content-Type: application/json

{
  "name": "John Doe",
  "email": "john@example.com",
  "service": "web-dev",
  "message": "I'd like to discuss a project..."
}
```

#### Get Projects
```javascript
GET /api/projects
Response: {
  "success": true,
  "projects": [...]
}
```

## 📊 **Admin Dashboard**

The admin dashboard provides a complete interface for managing your portfolio:

### Features
- **Real-time Statistics**: View contact form submissions and server status
- **Contact Management**: Review and manage incoming contact messages
- **System Monitoring**: Monitor server health and uptime
- **Data Export**: Export contact data for external processing

### Access
- **URL**: http://localhost:5000/admin.html
- **Default Password**: `admin123` (change in `.env` file)
- **Security**: Basic authentication with configurable credentials

## 🔧 **Environment Configuration**

### Required Environment Variables

```bash
# Server Configuration
PORT=5000
NODE_ENV=development

# Database
MONGODB_URI=mongodb://localhost:27017/portfolio

# Email Configuration
EMAIL_SERVICE=gmail
EMAIL_USER=your-email@gmail.com
EMAIL_PASS=your-app-password

# Security
JWT_SECRET=your-super-secret-jwt-key
```

### Email Setup
1. **Gmail**: Enable 2-factor authentication and generate an app password
2. **Outlook**: Use your account password or generate an app password
3. **Other Providers**: Configure according to your email provider's settings

## 🚀 **Deployment & Hosting Guide**

Your portfolio is now ready for deployment! Here are comprehensive hosting options:

---

## 📋 **Quick Deployment Options**

### **Option 1: Static Hosting (Frontend Only)**
Perfect for showcasing your portfolio without backend functionality.

#### **Netlify (Recommended)**
```bash
# 1. Build static files
npm install -g http-server
cd portfolio

# 2. Deploy to Netlify
npx netlify-cli deploy --prod --dir=.
```

#### **Vercel**
```bash
# 1. Install Vercel CLI
npm install -g vercel

# 2. Deploy
cd portfolio
vercel --prod
```

#### **GitHub Pages**
```bash
# 1. Create GitHub repository
# 2. Push your portfolio files
# 3. Enable Pages in repository settings
# 4. Access at: https://yourusername.github.io/portfolio
```

---

## 🔧 **Fullstack Hosting (Frontend + Backend)**

### **Option 2: Railway (Free & Easy)**
```bash
# 1. Install Railway CLI
npm install -g @railway/cli

# 2. Login and deploy
railway login
railway deploy
```

**Railway Features:**
- ✅ Free tier available
- ✅ Automatic HTTPS
- ✅ MongoDB integration
- ✅ Environment variables
- ✅ Custom domains

### **Option 3: Render**
```bash
# 1. Connect GitHub repository to Render
# 2. Create new Web Service
# 3. Set build command: npm install
# 4. Set start command: npm start
```

**Render Features:**
- ✅ Free tier with limitations
- ✅ Automatic deployments
- ✅ MongoDB Atlas integration
- ✅ Custom domains

### **Option 4: Heroku**
```bash
# 1. Install Heroku CLI
npm install -g heroku

# 2. Create Procfile
echo "web: npm start" > Procfile

# 3. Deploy
heroku create your-portfolio-app
heroku git:remote -a your-portfolio-app
git push heroku main
```

---

## ☁️ **Cloud Platform Deployment**

### **AWS (Advanced)**
```bash
# 1. Create EC2 instance
# 2. Install Node.js and MongoDB
# 3. Upload portfolio files
# 4. Configure nginx/pm2
# 5. Set up SSL with Let's Encrypt
```

### **Google Cloud Platform**
```bash
# 1. Create App Engine application
# 2. Configure app.yaml
# 3. Deploy with gcloud CLI
gcloud app deploy
```

### **DigitalOcean App Platform**
```bash
# 1. Connect GitHub repository
# 2. Configure build settings
# 3. Deploy automatically
```

---

## 🐳 **Docker Deployment**

### **Docker Setup**
```dockerfile
# Create Dockerfile
FROM node:18-alpine

WORKDIR /app
COPY package*.json ./
RUN npm ci --only=production

COPY . .
EXPOSE 5000

# Health check
HEALTHCHECK --interval=30s --timeout=3s --start-period=5s --retries=3 \
  CMD curl -f http://localhost:5000/api/health || exit 1

CMD ["npm", "start"]
```

### **Docker Compose (with MongoDB)**
```yaml
version: '3.8'
services:
  portfolio:
    build: .
    ports:
      - "5000:5000"
    environment:
      - MONGODB_URI=mongodb://mongodb:27017/portfolio
      - NODE_ENV=production
    depends_on:
      - mongodb

  mongodb:
    image: mongo:6
    volumes:
      - mongodb_data:/data/db
    ports:
      - "27017:27017"

volumes:
  mongodb_data:
```

---

## 🔐 **Production Configuration**

### **Environment Variables**
```bash
# Production .env file
NODE_ENV=production
PORT=5000

# Database (MongoDB Atlas recommended)
MONGODB_URI=mongodb+srv://username:password@cluster.mongodb.net/portfolio

# Email Configuration
EMAIL_SERVICE=gmail
EMAIL_USER=your-email@gmail.com
EMAIL_PASS=your-app-password

# Security
JWT_SECRET=your-super-secret-production-key

# Frontend URL (update with your domain)
FRONTEND_URL=https://yourdomain.com

# CORS Origins
ALLOWED_ORIGINS=https://yourdomain.com,https://www.yourdomain.com
```

### **Security Checklist**
- [ ] Change default admin password
- [ ] Use strong JWT secret
- [ ] Configure proper CORS origins
- [ ] Set up SSL/HTTPS
- [ ] Configure rate limiting
- [ ] Set up monitoring
- [ ] Backup database regularly

---

## 📱 **Mobile & Performance**

### **Performance Optimization**
```bash
# Compress static assets
npm install -g sharp
# Add image optimization to your build process

# Enable gzip compression
# Configure CDN for static assets
```

### **CDN Setup**
- **CloudFlare**: Free CDN with global edge network
- **AWS CloudFront**: Advanced CDN with custom domains
- **Bunny CDN**: Affordable CDN for static assets

---

## 🔍 **Domain & SSL Setup**

### **Custom Domain**
1. **Purchase Domain**: Namecheap, GoDaddy, or Google Domains
2. **DNS Configuration**:
   ```
   Type: A
   Name: @
   Value: YOUR_SERVER_IP

   Type: CNAME
   Name: www
   Value: yourdomain.com
   ```

### **Free SSL (Let's Encrypt)**
```bash
# Install certbot
sudo apt install certbot

# Generate SSL certificate
sudo certbot --nginx -d yourdomain.com -d www.yourdomain.com
```

---

## 📊 **Monitoring & Analytics**

### **Server Monitoring**
- **PM2 Monitoring**: `pm2 monit`
- **Application Metrics**: Built-in health check endpoint
- **Error Tracking**: Sentry or LogRocket

### **Analytics**
- **Google Analytics**: Track portfolio visitors
- **Hotjar**: User behavior analytics
- **Google Search Console**: SEO monitoring

---

## 🚀 **Deployment Scripts**

### **Automated Deployment**
```bash
#!/bin/bash
# deploy.sh

echo "🚀 Starting deployment..."

# Pull latest changes
git pull origin main

# Install dependencies
npm install --production

# Run database migrations (if needed)
# npm run migrate

# Build frontend (if needed)
# npm run build

# Restart application
pm2 restart portfolio

echo "✅ Deployment completed!"
```

---

## 🆘 **Troubleshooting**

### **Common Issues**

**Port Already in Use:**
```bash
# Find and kill process
lsof -ti:5000 | xargs kill -9
# Or use different port
PORT=3001 npm start
```

**MongoDB Connection Issues:**
```bash
# Check MongoDB status
sudo systemctl status mongod

# Restart MongoDB
sudo systemctl restart mongod
```

**Permission Errors:**
```bash
# Fix file permissions
chmod -R 755 portfolio/
chown -R $USER:$USER portfolio/
```

---

## 📞 **Support & Resources**

### **Documentation**
- [Express.js Docs](https://expressjs.com/)
- [MongoDB Atlas](https://docs.atlas.mongodb.com/)
- [Railway Documentation](https://docs.railway.app/)
- [Heroku Dev Center](https://devcenter.heroku.com/)

### **Community**
- [Stack Overflow](https://stackoverflow.com/questions/tagged/node.js)
- [Reddit r/webdev](https://reddit.com/r/webdev)
- [Dev.to](https://dev.to/)

---

## 🎯 **Recommended Hosting**

### **For Beginners (Free)**
1. **Railway** - Easiest fullstack deployment
2. **Netlify** - Best for static hosting
3. **Vercel** - Great for frontend with API routes

### **For Production**
1. **DigitalOcean App Platform** - Affordable and scalable
2. **AWS Lightsail** - Cost-effective cloud hosting
3. **Google Cloud Run** - Serverless deployment

### **For Enterprise**
1. **AWS ECS/Fargate** - Scalable container hosting
2. **Google Cloud Platform** - Full cloud infrastructure
3. **Microsoft Azure** - Enterprise-grade hosting

---

## ✅ **Deployment Checklist**

- [ ] Choose hosting platform
- [ ] Set up domain name
- [ ] Configure environment variables
- [ ] Set up database (MongoDB Atlas recommended)
- [ ] Configure SSL/HTTPS
- [ ] Test deployment
- [ ] Set up monitoring
- [ ] Configure backups
- [ ] Update DNS settings
- [ ] Test live site

Your portfolio is production-ready! Choose the hosting option that best fits your needs and budget. 🚀

## 📁 **Complete File Structure**

```
portfolio/
├── 📄 Frontend Files
│   ├── index.html          # Main portfolio website
│   ├── style.css           # All styling and themes
│   ├── script.js           # Interactive functionality
│   └── admin.html          # Admin dashboard interface
│
├── ⚙️ Backend Files
│   ├── server.js           # Express server and API endpoints
│   ├── package.json        # Node.js dependencies
│   ├── setup.js            # Automated setup script
│   └── .env.example        # Environment configuration template
│
├── 🖼️ Assets
│   ├── profile.jpg         # Your profile image (add this)
│   └── image/              # Profile images folder
│       └── profile.png     # Alternative profile image
│
├── 📚 Documentation
│   └── README.md           # This comprehensive guide
│
└── 🔧 Configuration
    └── .env               # Environment variables (create from .env.example)
```

## Customization

### Colors

Edit the CSS custom properties in `style.css`:

```css
:root {
  --primary-color: #6366f1;
  --secondary-color: #8b5cf6;
  --accent-color: #f59e0b;
  /* ... more colors */
}
```

### Content

Update personal information in `index.html`:

- Name and title in hero section
- About text and skills
- Contact information
- Project details

### Images

- Replace `profile.jpg` with your professional headshot
- Update project images in the projects section
- Add favicon if desired

## Browser Support

- ✅ Chrome 90+
- ✅ Firefox 88+
- ✅ Safari 14+
- ✅ Edge 90+

## Performance

- **Optimized Loading**: Efficient CSS and JavaScript
- **Smooth Animations**: 60fps animations with CSS transforms
- **Responsive Images**: Proper image sizing and fallbacks
- **Accessibility**: ARIA labels and keyboard navigation

## License

This portfolio template is created for personal use. Customize as needed for your professional presentation.
