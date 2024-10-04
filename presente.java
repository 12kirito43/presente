// Função para criar novos corações em espiral
function createHeart() {
    const heart = document.createElement('div');
    heart.className = 'heart';
    heart.style.left = Math.random() < 0.5 ? '10vw' : '90vw'; // Lado aleatório
    heart.style.animationDuration = Math.random() * 3 + 2 + 's'; // Duração aleatória
    heart.style.animationName = 'spiral'; // Define a animação
    document.body.appendChild(heart);

    // Remover o coração após a animação
    setTimeout(() => {
        heart.remove();
    }, 5000); // Tempo para o coração desaparecer
}

// Criar corações a cada 500ms
setInterval(createHeart, 500);

const playlist = [
    'musicas/spotifydown.com - Chasing Cars.mp3',
    'musicas/spotifydown.com - Far Away.mp3',
    'musicas/spotifydown.com - Heaven.mp3',
    'musicas/spotifydown.com - Love Me Tender.mp3',
    'musicas/spotifydown.com - Making Love Out of Nothing at All.mp3',
    'musicas/spotifydown.com - November Rain.mp3',
    'musicas/spotifydown.com - Photograph.mp3',
    'musicas/DBGT - sorriso resplandecente (tradução_legendado).mp3',
    '',
    '',
];

let currentTrack = 0;
const player = document.getElementById('player');
const audioSource = document.getElementById('audioSource');

function playTrack() {
    audioSource.src = playlist[currentTrack];
    player.load();
    player.play();
}

player.addEventListener('ended', () => {
    currentTrack = (currentTrack + 1) % playlist.length;
    playTrack();
});

// Iniciar a primeira música
playTrack();
