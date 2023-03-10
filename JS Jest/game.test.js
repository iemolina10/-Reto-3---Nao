const isGameState = require('./game');

// First test for game running
test('Test if game is not over yet', () => {
    const result = isGameState('Game Continues');
    expect(result).toBe(true);
})
// Second test for game is over
test('Test if game is over', () => {
    const result = isGameState('Game Over');
    expect(result).toBe(false);
})