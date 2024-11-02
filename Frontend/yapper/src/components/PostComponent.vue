<script setup>
</script>

<template>
  <div class="post_container">
    <div class="post_top">
      <div class="pfpDiv">
        <img class="pfp" src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg/768px-Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg" alt="logo" />
      </div>
      <div class="user_info">
        <div>
          <div class="username">Username</div>
        </div>
        <div class="bio">
          <div class="bio_text">Bio</div>
        </div>
      </div>
    </div>

    <div class="post_middle">
      <div class="post_image">
        <img class="post_content_image" src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg/768px-Goofy-zoomed-cute-cat-pfp-rmb3vpdhn9qbyxfg.jpg" alt="logo" />
      </div>
    </div>

    <div class="post_bottom">
      <div class="commentDiv post_bottom_div">Comment</div>
      <div class="repostDiv post_bottom_div">Repost</div>
      <div class="likeDiv post_bottom_div">Like</div>
      <div class="viewsDiv post_bottom_div">Views</div>
      <div class="favouriteDiv post_bottom_div">Favourite</div>
      <div class="shareDiv post_bottom_div">Share</div>
      <div class="bookmarkDiv post_bottom_div">Bookmark</div>
    </div>
  </div>
</template>

<style scoped>
.post_container {
  display: flex;
  flex-direction: column;
  width: 100%;
  height: 100vh;
  border: 1px solid black;
  box-sizing: border-box;
}

.post_top {
  display: flex;
  flex-direction: row;
  width: 100%;
  height: 15%;
  border: 1px solid black;
  background: yellow;
}

.post_middle {
  display: flex;
  width: 100%;
  justify-content: center;
  align-items: center;
}

.post_image {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
}

.post_content_image {
  width: 50%;
  height: auto;
  border: 1px solid black;
}

.post_bottom {
  display: flex;
  justify-content: space-around;
  align-items: center;
  background: green;
  width: 100%;
  height: 10%;
  border: 1px solid black;
  margin-bottom: 5%;
}

.pfpDiv {
  padding: 5px;
  display: flex;
  justify-content: center;
  align-items: center;
}

.pfp {
  width: 50px;
  height: 50px;
  border-radius: 30px;
  object-fit: cover;
}

.post_bottom_div:hover {
  background: #333;
  color: white;
  cursor: pointer;
}

.post_bottom_div {
  width: 100%;
  height: 100%;
  display: flex;
  justify-content: center;
}

.user_info {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}




</style>


