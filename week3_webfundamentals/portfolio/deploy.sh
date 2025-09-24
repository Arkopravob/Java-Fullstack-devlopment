#!/bin/bash

# Portfolio Deployment Script
# This script helps you deploy your portfolio to various hosting platforms

echo "🚀 Portfolio Deployment Script"
echo "=============================="
echo ""

# Function to display menu
show_menu() {
    echo "Choose your hosting platform:"
    echo "1) Railway (Recommended - Free & Easy)"
    echo "2) Render (Free tier available)"
    echo "3) Heroku (Free tier available)"
    echo "4) Netlify (Static hosting only)"
    echo "5) Vercel (Static + Serverless)"
    echo "6) Local Development Setup"
    echo "7) Exit"
    echo ""
    echo "Enter your choice (1-7):"
}

# Function to check prerequisites
check_prerequisites() {
    echo "🔍 Checking prerequisites..."

    if ! command -v node &> /dev/null; then
        echo "❌ Node.js is not installed. Please install Node.js first."
        echo "   Visit: https://nodejs.org/"
        exit 1
    fi

    if ! command -v npm &> /dev/null; then
        echo "❌ npm is not installed. Please install npm first."
        exit 1
    fi

    if ! command -v git &> /dev/null; then
        echo "⚠️  Git is not installed. Some deployment options may not work."
        echo "   Consider installing Git for better deployment experience."
    fi

    echo "✅ Prerequisites check passed!"
}

# Function to setup Railway
setup_railway() {
    echo "🚂 Setting up Railway deployment..."

    if ! command -v railway &> /dev/null; then
        echo "Installing Railway CLI..."
        npm install -g @railway/cli
    fi

    echo "🔐 Please login to Railway:"
    railway login

    echo "🚀 Deploying to Railway..."
    railway deploy

    echo "✅ Railway deployment completed!"
    echo "📝 Your app will be available at: https://your-app.railway.app"
}

# Function to setup Render
setup_render() {
    echo "🎨 Setting up Render deployment..."

    echo "📋 For Render deployment:"
    echo "1. Go to https://render.com"
    echo "2. Click 'New' -> 'Blueprint'"
    echo "3. Connect your GitHub repository"
    echo "4. Set the following build settings:"
    echo "   - Runtime: Node"
    echo "   - Build Command: npm install"
    echo "   - Start Command: npm start"
    echo "5. Add environment variables from your .env file"
    echo "6. Deploy!"

    echo ""
    echo "🔗 Render will provide you with a URL like: https://your-app.onrender.com"
}

# Function to setup Heroku
setup_heroku() {
    echo "🟣 Setting up Heroku deployment..."

    if ! command -v heroku &> /dev/null; then
        echo "Installing Heroku CLI..."
        npm install -g heroku
    fi

    echo "🔐 Please login to Heroku:"
    heroku login

    echo "📦 Creating Heroku app..."
    heroku create your-portfolio-$(date +%s)

    echo "📝 Creating Procfile..."
    echo "web: npm start" > Procfile

    echo "🚀 Deploying to Heroku..."
    git add .
    git commit -m "Deploy to Heroku"
    git push heroku main

    echo "✅ Heroku deployment completed!"
    echo "📝 Your app will be available at: https://your-app.herokuapp.com"
}

# Function to setup Netlify
setup_netlify() {
    echo "🌐 Setting up Netlify deployment..."

    if ! command -v netlify &> /dev/null; then
        echo "Installing Netlify CLI..."
        npm install -g netlify-cli
    fi

    echo "🔐 Please login to Netlify:"
    netlify login

    echo "📦 Deploying to Netlify..."
    netlify deploy --prod --dir=.

    echo "✅ Netlify deployment completed!"
    echo "📝 Your site will be available at: https://your-site.netlify.app"
    echo ""
    echo "⚠️  Note: This is static hosting only. Backend features won't work."
}

# Function to setup Vercel
setup_vercel() {
    echo "▲ Setting up Vercel deployment..."

    if ! command -v vercel &> /dev/null; then
        echo "Installing Vercel CLI..."
        npm install -g vercel
    fi

    echo "🔐 Please login to Vercel:"
    vercel login

    echo "📦 Deploying to Vercel..."
    vercel --prod

    echo "✅ Vercel deployment completed!"
    echo "📝 Your app will be available at: https://your-app.vercel.app"
}

# Function to setup local development
setup_local() {
    echo "💻 Setting up local development environment..."

    echo "1️⃣ Installing dependencies..."
    npm install

    echo "2️⃣ Setting up environment..."
    if [ ! -f .env ]; then
        cp .env.example .env
        echo "⚠️  Please edit .env file with your configuration"
    fi

    echo "3️⃣ Starting services..."
    echo ""
    echo "Terminal 1 - Backend:"
    echo "  npm run dev"
    echo ""
    echo "Terminal 2 - Frontend:"
    echo "  npx http-server . -p 8000"
    echo ""
    echo "Terminal 3 - Admin Dashboard:"
    echo "  Access: http://localhost:5000/admin.html"
    echo ""
    echo "✅ Local setup completed!"
}

# Main script
check_prerequisites

while true; do
    show_menu
    read -r choice

    case $choice in
        1)
            setup_railway
            break
            ;;
        2)
            setup_render
            break
            ;;
        3)
            setup_heroku
            break
            ;;
        4)
            setup_netlify
            break
            ;;
        5)
            setup_vercel
            break
            ;;
        6)
            setup_local
            break
            ;;
        7)
            echo "👋 Goodbye!"
            exit 0
            ;;
        *)
            echo "❌ Invalid option. Please choose 1-7."
            echo ""
            ;;
    esac
done
