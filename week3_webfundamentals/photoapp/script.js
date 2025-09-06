let post1 = {
    id: 1,
    author: 'John',
    content: 'My first Post!',
    likes: 10,
    comments: ['Great post!', 'Nice photo!'],
    image: 'https://files.codingninjas.in/image2-28694.jpg'
};
function renderPosts() {
    const postsContainer = document.getElementById('posts');
    postsContainer.innerHTML = ''; // Clear previous posts

    const postElement = document.createElement('div');
    postElement.classList.add('post');

    // Author
    const authorElement = document.createElement('h3');
    authorElement.textContent = post1.author;

    // Image
    const imageElement = document.createElement('img');
    imageElement.src = post1.image;
    imageElement.alt = 'Post image';

    // Content
    const contentElement = document.createElement('p');
    contentElement.textContent = post1.content;

    // Like Button
    const likeButton = document.createElement('button');
    likeButton.textContent = `❤️ Like (${post1.likes})`;
    likeButton.onclick = () => {
        post1.likes++;
        likeButton.textContent = `❤️ Like (${post1.likes})`;
    };

    // Comment Input
    const commentInput = document.createElement('input');
    commentInput.type = 'text';
    commentInput.placeholder = 'Write a comment...';

    // Comment Button
    const commentButton = document.createElement('button');
    commentButton.textContent = '💬 Comment';

    // Comments Container
    const commentsContainer = document.createElement('div');
    commentsContainer.classList.add('comments-container');
    commentsContainer.style.display = 'none';

    post1.comments.forEach(comment => {
        const commentElement = document.createElement('p');
        commentElement.textContent = comment;
        commentsContainer.appendChild(commentElement);
    });

    // Toggle Comments
    commentButton.onclick = () => {
        if (commentInput.value.trim()) {
            const newComment = document.createElement('p');
            newComment.textContent = commentInput.value;
            commentsContainer.appendChild(newComment);
            commentInput.value = '';
        }
        commentsContainer.style.display =
            commentsContainer.style.display === 'none' ? 'block' : 'none';
    };

    // Footer
    const footer = document.createElement('div');
    footer.classList.add('post-footer');
    footer.textContent = `Post ID: ${post1.id}`;

    // Append all elements
    postElement.appendChild(authorElement);
    postElement.appendChild(imageElement);
    postElement.appendChild(contentElement);
    postElement.appendChild(likeButton);
    postElement.appendChild(commentInput);
    postElement.appendChild(commentButton);
    postElement.appendChild(commentsContainer);
    postElement.appendChild(footer);

    postsContainer.appendChild(postElement);
}

renderPosts();